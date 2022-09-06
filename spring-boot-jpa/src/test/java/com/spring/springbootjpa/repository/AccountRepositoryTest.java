package com.spring.springbootjpa.repository;

import com.spring.springbootjpa.entity.Account;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class AccountRepositoryTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private AccountRepository accountRepository;
    
    @Test
    public void di() throws Exception{

        try(Connection connection = dataSource.getConnection()){
            DatabaseMetaData metaData = connection.getMetaData();

            System.out.println("getClass() = " + metaData.getClass());
            System.out.println("getURL() = " + metaData.getURL());
            System.out.println("getDriverName() = " + metaData.getDriverName());
            System.out.println("getUserName() = " + metaData.getUserName());
        }
    }
    
    @Test
    public void save() throws Exception{

        Account account = Account.builder()
                .password("1234")
                .username("bbung")
                .build();

        accountRepository.save(account);

        Optional<Account> findAccount1 = accountRepository.findByUsername("bbung");
        Optional<Account> findAccount2 = accountRepository.findByUsername("bbung2");

        assertThat(findAccount1).isNotEmpty();
        assertThat(findAccount2).isEmpty();

    }
}