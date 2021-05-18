package com.mytests.spring.springresttemplatetest1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
public class TestRestTemplate_test1 {

    static TestRestTemplate testRestTemplate;
    @BeforeAll
    static void setUp() {
        testRestTemplate = new TestRestTemplate();
    }

    @Test
    void test5_testRestTemplate() {
        ResponseEntity<String> response = testRestTemplate.getForEntity("http://localhost:8080/test5/foo/bar", String.class);
        System.out.println(response.getBody());
    }
}
