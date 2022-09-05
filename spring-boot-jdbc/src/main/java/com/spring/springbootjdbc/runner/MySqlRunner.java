package com.spring.springbootjdbc.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

@Component
public class MySqlRunner implements ApplicationRunner {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        // dataconnection check
        try (Connection connection = dataSource.getConnection()){
            
            // cp check
            System.out.println("getClass = " + dataSource.getClass());
            // url check
            System.out.println("getURL = " + connection.getMetaData().getURL());
            // username check
            System.out.println("getUserName = " + connection.getMetaData().getUserName());
            
        }
    }
}
