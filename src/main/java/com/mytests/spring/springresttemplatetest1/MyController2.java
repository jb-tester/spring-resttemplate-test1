package com.mytests.spring.springresttemplatetest1;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

/**
 **
 * <p>Created by irina on 18.05.2021.</p>
 * <p>Project: spring-resttemplate-test1</p>
 **
 */
@RestController
public class MyController2 {
    @GetMapping("/test6")
    public String test6(){
        return "test6";
    }
    @PostMapping("/test7")
    @ResponseBody
    public ResponseEntity<String> test7(@RequestBody String bar){
        final URI location = ServletUriComponentsBuilder
                .fromCurrentServletMapping()
                .path("/test7/{id}")
                .build()
                .expand(bar)
                .toUri();

        final HttpHeaders headers = new HttpHeaders();
        headers.setLocation(location);

        final ResponseEntity<String> entity = new ResponseEntity<String>(bar, headers, HttpStatus.CREATED);
        return entity;
    }
    @RequestMapping(method = RequestMethod.PATCH, value = "/test7/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String patchTest7(@PathVariable("id") final long id, @RequestBody final String foo) {

        return foo+id;
    }
    @GetMapping("/test8")
    public String test8(){
        return "test8";
    }
    @GetMapping("/test9")
    public String test9(){
        return "test9";
    }
}
