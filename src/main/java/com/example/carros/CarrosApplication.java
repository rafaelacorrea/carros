package com.example.carros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication(exclude = SqlInitializationAutoConfiguration.class)
@EntityScan("com.example.*")
public class CarrosApplication {

	public static void main(String[] args) {

		SpringApplication.run(CarrosApplication.class, args);
	}

}
