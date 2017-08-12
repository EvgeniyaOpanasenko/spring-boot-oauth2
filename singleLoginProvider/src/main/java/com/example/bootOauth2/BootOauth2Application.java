package com.example.bootOauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//To make the link to Facebook we need an @EnableOAuth2Sso annotation

@SpringBootApplication
public class BootOauth2Application {

    public static void main(String[] args) {
        SpringApplication.run(BootOauth2Application.class, args);
    }
}
