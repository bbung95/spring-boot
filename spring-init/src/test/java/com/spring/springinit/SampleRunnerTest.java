package com.spring.springinit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(properties = {"user.name=rai"})
class SampleRunnerTest {

    @Autowired
    Environment environment;

    @Test
    public void runTest() throws Exception{

        String name = environment.getProperty("user.name");
        System.out.println("name = " + name);

        Assertions.assertThat(name).isEqualTo("bbung");
    }
}