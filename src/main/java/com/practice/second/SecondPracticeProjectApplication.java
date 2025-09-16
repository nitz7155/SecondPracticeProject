package com.practice.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SecondPracticeProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecondPracticeProjectApplication.class, args);
    }
}
