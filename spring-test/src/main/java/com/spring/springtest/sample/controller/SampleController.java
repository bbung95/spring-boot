package com.spring.springtest.sample.controller;

import com.spring.springtest.sample.service.SampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    private Logger logger = LoggerFactory.getLogger(SampleService.class);

    @Autowired
    private SampleService sampleService;

    @GetMapping("hello")
    public String hello(){

        String name = sampleService.getName();
        logger.info(name);
        System.out.println("name = " + name);
        System.out.println("name = " + name);
        System.out.println("name = " + name);

        return "hello " + name;
    }

}
