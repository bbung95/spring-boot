package com.spring.springbootstarted.config;

import com.spring.springbootstarted.entity.Holoman;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HolomanProperties.class)
public class HolomanConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public Holoman holoman(HolomanProperties properties){

        Holoman holoman = new Holoman();
        holoman.setHowLong(properties.getHowLong());
        holoman.setName(properties.getName());

        return holoman;
    }

//    @Bean
//    public Holoman holoman(){
//
//        Holoman holoman = new Holoman();
//        holoman.setHowLong(60);
//        holoman.setName("rai");
//
//        return holoman;
//    }
}
