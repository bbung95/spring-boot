package com.spring.springbootsecurity.runner;

import com.spring.springbootsecurity.repository.AccountRepository;
import com.spring.springbootsecurity.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner {

    @Autowired
    private AccountService accountService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        accountService.createAccount("bbung", "1234");
    }
}
