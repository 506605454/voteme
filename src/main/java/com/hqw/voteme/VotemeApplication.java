package com.hqw.voteme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@EnableAutoConfiguration
@SpringBootApplication
public class VotemeApplication {


	public static void main(String[] args) {
		SpringApplication.run(VotemeApplication.class, args);
	}
}
