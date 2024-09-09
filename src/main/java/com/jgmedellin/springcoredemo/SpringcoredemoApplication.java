package com.jgmedellin.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication /*(
		scanBasePackages = {
				"com.jgmedellin.springcoredemo",
				"com.jgmedellin.util"
		}
)*/ // By default, Spring Boot will scan the current package and all of its sub-packages, if
// you want to scan other packages, you can use the scanBasePackages attribute and list the packages you want to scan.
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
