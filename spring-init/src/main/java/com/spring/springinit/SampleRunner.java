package com.spring.springinit;

import com.spring.springinit.properties.SampleProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(SampleRunner.class);

    @Autowired
    private SampleProperties sampleProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        logger.info("=========================");
        logger.info("name = " + sampleProperties.getName());
        logger.info("name = " + sampleProperties.getAge());
        logger.info("name = " + sampleProperties.getFullname());
        logger.info("name = " + sampleProperties.getSessionTime());
        logger.info("=========================");

    }
}
