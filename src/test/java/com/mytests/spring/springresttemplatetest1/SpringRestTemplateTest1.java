package com.mytests.spring.springresttemplatetest1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// run application before running this test
@SpringBootTest
class SpringRestTemplateTest1 {
    
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
    
    


}
