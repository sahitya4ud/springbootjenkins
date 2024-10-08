package com.springboot.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping(value = "api/hello",consumes = "application/json",produces = "application/json")
    public String getAccess(){
        System.out.println("hello world");
        System.out.println("hello");
        return "hello";

    }

}
