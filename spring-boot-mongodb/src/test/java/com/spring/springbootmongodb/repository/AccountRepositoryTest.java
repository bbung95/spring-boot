package com.spring.springbootmongodb.repository;

import com.spring.springbootmongodb.entity.Account;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest
class AccountRepositoryTest {

    @Autowired
    private AccountRepository accountRepository;
    
    @Test
    public void findByEmail() throws Exception{

        Account account = new Account();
        account.setUsername("bbung");
        account.setEmail("bbung@email.com");

        accountRepository.save(account);

        Optional<Account> byId = accountRepository.findById(account.getId());
        assertThat(byId.get().getEmail()).isEqualTo("bbung@email.com");
    }

}