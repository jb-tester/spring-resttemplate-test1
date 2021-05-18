package com.mytests.spring.springresttemplatetest1;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Set;

/**
 * *
 * <p>Created by irina on 23.10.2020.</p>
 * <p>Project: spring-resttemplate-test1</p>
 * *
 */
@Service
public class RestTemplateClient1 {

    public static final String TEST_2_URL = "http://localhost:8080/test2";
    public static final String TEST_3_URL = "http://localhost:8080/test3/";

    public void test0(){
        System.out.println("Trying /test0 : url as value, no pathvars");
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response
                = restTemplate.getForEntity("http://localhost:8080/test0", String.class);
        HttpHeaders httpHeaders = restTemplate.headForHeaders("http://localhost:8080/test0");
        Set<HttpMethod> optionsForAllow = restTemplate.optionsForAllow("http://localhost:8080/test0");
        
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody());
        System.out.println(httpHeaders.getContentType());
        System.out.println(optionsForAllow);
    }
    public void test1(){
        System.out.println("Trying /test1/{var}: url as local variable, pathvar == 'foo1' :");
        RestTemplate restTemplate = new RestTemplate();
        String test1Url
                = "http://localhost:8080/test1";
        ResponseEntity<String> response
                = restTemplate.getForEntity(test1Url + "/foo1", String.class);
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody());
    }
    public void test2(){
        System.out.println("Trying /test2/{var}: url as constant, pathvar == 'foo2' :");
        RestTemplate restTemplate = new RestTemplate();
        
        ResponseEntity<String> response
                = restTemplate.getForEntity(TEST_2_URL + "/{pv1}", String.class, "foo2");
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody());
    }
    public void test3_with_param(String s){
        System.out.println("Trying /test3/{var}: url as constant, pathvar passed as parameter, passed argument: "+s+":");
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response
                = restTemplate.getForEntity(TEST_3_URL + s, String.class);
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody());
    }
    public void test4(){
        System.out.println("Trying /test4?rp1=foo4: url as value, pathvar 'foo4' and request parameter 'bar1' are passed as uriVariables:");
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response
                = restTemplate.getForEntity("http://localhost:8080/test4/{pv1_value}?rp1={rp1_value}",String.class, "foo4","bar1");
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody());
    }
    
}
