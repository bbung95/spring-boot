package com.spring.springbootgettingstarted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootConfiguration
//@ComponentScan
//@EnableAutoConfiguration

@SpringBootApplication
public class BootStartApplication {

	public static void main(String[] args) {

//		SpringApplication application = new SpringApplication(BootStartApplication.class);
//		application.run(args);

		SpringApplication.run(BootStartApplication.class, args);
	}

}
