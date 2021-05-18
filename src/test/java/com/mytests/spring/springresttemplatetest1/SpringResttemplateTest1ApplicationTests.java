package com.mytests.spring.springresttemplatetest1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class SpringResttemplateTest1ApplicationTests {
    
    
    static final String FILE_URL = "http://localhost:8080/test5/";

    static RestTemplate restTemplate;
    static TestRestTemplate testRestTemplate;
    @BeforeAll
    static void setUp() {
        restTemplate = new RestTemplate();
        testRestTemplate = new TestRestTemplate();
    }
    
    @Autowired RestTemplateClient1 restTemplateClient1;
    @Test
    void test0() {
        restTemplateClient1.test0();
    }
    @Test
    void test1() {
        restTemplateClient1.test1();
    }
    @Test
    void test2() {
        restTemplateClient1.test2();
    }
    @Test
    void test3() {
        restTemplateClient1.test3_with_param("foo3");
    }
    @Test
    void test4() {
        restTemplateClient1.test4();
    }
    
    

    @Test
    void test5_testRestTemplate() {
        ResponseEntity<String> response = testRestTemplate.getForEntity("http://localhost:8080/test5/foo/bar", String.class);
        System.out.println(response.getBody());
    }
}
