package com.mytests.spring.springresttemplatetest1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// For RestTemplate
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


}
