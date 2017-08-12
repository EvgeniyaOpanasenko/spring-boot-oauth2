package com.example.bootOauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

//To make the link to Facebook we need an @EnableOAuth2Sso annotation on our main class

@SpringBootApplication
@EnableOAuth2Sso
public class BootOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(BootOauth2Application.class, args);
	}
}
