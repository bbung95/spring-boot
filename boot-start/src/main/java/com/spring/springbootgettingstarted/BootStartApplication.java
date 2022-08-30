package com.spring.springbootgettingstarted;

import com.spring.springbootstarted.entity.Holoman;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootConfiguration
//@ComponentScan
//@EnableAutoConfiguration

@SpringBootApplication
public class BootStartApplication {

	public static void main(String[] args) {

		SpringApplication application = new SpringApplication(BootStartApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);

//		SpringApplication.run(BootStartApplication.class, args);
	}

//	@Bean
//	public Holoman holoman(){
//
//		Holoman holoman = new Holoman();
//		holoman.setName("bbung");
//		holoman.setHowLong(20);
//
//		return holoman;
//	}
}
