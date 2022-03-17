package com.example.parentProject;

import org.apache.camel.spring.boot.CamelAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {CamelAutoConfiguration.class})
@ImportResource("classpath:spring/mycamel.xml")
public class ParentProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParentProjectApplication.class, args);
	}

}
