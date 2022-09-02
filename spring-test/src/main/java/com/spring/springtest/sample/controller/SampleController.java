package com.spring.springtest.sample.controller;

import com.spring.springtest.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @GetMapping("hello")
    public String hello(){

        String name = sampleService.getName();

        return "hello " + name;
    }
}
