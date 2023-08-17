package com.example.auth.okta;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class AuthOktaApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(AuthOktaApplication.class, args);
        log.debug("AuthOktaApplication Started !");
    }
}