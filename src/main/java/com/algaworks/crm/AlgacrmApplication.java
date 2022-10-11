package com.algaworks.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@ComponentScan("com.algaworks.crm.repository")
public class AlgacrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgacrmApplication.class, args);
	}

}
