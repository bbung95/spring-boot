//package com.spring.springbootjdbc.runner;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Component;
//
//import javax.sql.DataSource;
//import java.sql.Connection;
//import java.sql.Statement;
//
//@Component
//public class H2Runner implements ApplicationRunner {
//
//    @Autowired
//    private DataSource dataSource;
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//
//        // dataconnection check
//        try (Connection connection = dataSource.getConnection()){
//
//            // url check
//            System.out.println("connection = " + connection.getMetaData().getURL());
//            // username check
//            System.out.println("connection = " + connection.getMetaData().getUserName());
//
//            Statement statement = connection.createStatement();
//            String sql = "CREATE TABLE USERS(ID INTEGER NOT NULL, name VARCHAR(255), PRIMARY KEY (ID))";
//            statement.executeUpdate(sql);
//        }
//
//        jdbcTemplate.execute("INSERT INTO USERS VALUES (1, 'bbung')");
//    }
//}
