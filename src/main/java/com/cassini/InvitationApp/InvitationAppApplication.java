package com.cassini.InvitationApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableAutoConfiguration
public class InvitationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvitationAppApplication.class, args);
	}



}
