package com.sami.ex2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnotherProjectConfig {

    @Bean
    String carDouc() {
        return "These are the car documents";
    }
}
