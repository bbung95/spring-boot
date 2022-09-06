package com.spring.springbootmongodb.repository;

import com.spring.springbootmongodb.entity.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<Account, String> {


}
