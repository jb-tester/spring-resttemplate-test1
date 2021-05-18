package com.mytests.spring.springresttemplatetest1;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

/**
 * *
 * <p>Created by irina on 23.10.2020.</p>
 * <p>Project: spring-resttemplate-test1</p>
 * *
 */
@RestController
public class MyController1 {
    @GetMapping("/test0")
    public String test0(){
        return "test0";
    }
    @GetMapping("/test1/{pv1}")
    public String test1(@PathVariable("pv1") String pv1) {
        return "test1: with " + pv1;
    }
    @GetMapping("/test2/{pv1}")
    public String test2(@PathVariable("pv1") String pv1) {
        return "test2: with " + pv1;
    }
    @GetMapping("/test3/{pv1}")
    public String test3(@PathVariable("pv1") String pv1) {
        return "test3: with " + pv1;
    }
    @GetMapping("/test4/{pv1}")
    public String test4(@RequestParam String rp1, @PathVariable String pv1){
        return "test4 ";
    }

    @GetMapping("/test5/{pv1}/{pv2}")
    public String test5(@PathVariable String pv1, @PathVariable String pv2){
        return "test5 "+pv1+pv2;
    }

}
