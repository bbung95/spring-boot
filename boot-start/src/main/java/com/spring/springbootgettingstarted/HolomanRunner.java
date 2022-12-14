package com.spring.springbootgettingstarted;

import com.spring.springbootstarted.entity.Holoman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class HolomanRunner implements ApplicationRunner {

    @Autowired
    private Holoman holoman;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("holoman = " + holoman);
    }
}
