package com.example.testapt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.testapt.controller"})
@EntityScan("com.example.testapt.model")
@EnableJpaRepositories("com.example.testapt.repository")
public class TestAptApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestAptApplication.class, args);
    }

}
