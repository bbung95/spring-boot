package com.spring.springbootredis.runner;

import com.spring.springbootredis.entity.Account;
import com.spring.springbootredis.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class RedisRunner implements ApplicationRunner {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

          /*
          * StringRedisTemplate
           */
//        ValueOperations<String, String> stringStringValueOperations = redisTemplate.opsForValue();
//
//        stringStringValueOperations.set("bbung", "rai");
//        stringStringValueOperations.set("springboot", "2.0");
//        stringStringValueOperations.set("hello", "world");

        /*
        * CrudRepository
         */
        Account account = new Account();
        account.setUsername("bbung");
        account.setEmail("bbung@email.com");

        accountRepository.save(account);

        Optional<Account> findAccount = accountRepository.findById(account.getId());
        System.out.println("id = " + findAccount.get().getId());
        System.out.println("username = " + findAccount.get().getUsername());
        System.out.println("email = " + findAccount.get().getEmail());

    }
}
