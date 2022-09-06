package com.spring.springbootmongodb;

import com.spring.springbootmongodb.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;

@SpringBootApplication
public class SpringBootMongodbApplication {

//    @Autowired
//    private MongoTemplate mongoTemplate;

    @Autowired
    private MongoRepository mongoRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMongodbApplication.class, args);
    }

//    @Bean
//    public ApplicationRunner applicationRunner(){
//        return args -> {
//
//            Account account = new Account();
//            account.setUsername("bbung");
//            account.setEmail("bbung@email.com");
//
//            /*
//            * MongoTemplate
//             */
////            mongoTemplate.insert(account);
//
//            mongoRepository.save(account);
//
//            System.out.println("finish");
//        };
//    }
}
