package com.testinspring.testspring.config;

import com.testinspring.testspring.domain.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    Book book(){
    return  new Book();

    }


}
