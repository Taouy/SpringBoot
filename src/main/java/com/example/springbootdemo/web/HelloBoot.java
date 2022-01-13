package com.example.springbootdemo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloBoot {


    @Resource
    String helloMsg;

    @GetMapping("hello")
    public String hello() {

        return helloMsg;
    }
}
