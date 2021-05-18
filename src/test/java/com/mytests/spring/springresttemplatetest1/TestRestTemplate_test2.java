package com.mytests.spring.springresttemplatetest1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import java.net.URI;

/**
 * *
 * <p>Created by irina on 03.11.2020.</p>
 * <p>Project: spring-resttemplate-test1</p>
 * <b> Test TestRestTemplate </b>
 * *
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestRestTemplate_test2 {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void test9() {
        ResponseEntity<String> response = restTemplate.exchange("/test9", HttpMethod.GET, null, String.class);
        Assertions.assertEquals(response.getBody(),"test9");
    }

    // No URL references for the methods below though they are shown correctly in Endpoints view - https://youtrack.jetbrains.com/issue/IDEA-269577

    @Test
    void test8(){
        String foo = restTemplate.getForObject("/test8", String.class);
        Assertions.assertEquals(foo,"test8");
    }

    @Test
    void test7() {
        HttpEntity<String> req = new HttpEntity<String>("bar");
        URI location = restTemplate.postForLocation("/test7", req);
        System.out.println(location);
        Assertions.assertNotNull(location);
    }
    @Test
    void test6() {
        ResponseEntity<String> response = restTemplate.getForEntity("/test6", String.class);
        Assertions.assertEquals(response.getBody(),"test6");

    }
}
