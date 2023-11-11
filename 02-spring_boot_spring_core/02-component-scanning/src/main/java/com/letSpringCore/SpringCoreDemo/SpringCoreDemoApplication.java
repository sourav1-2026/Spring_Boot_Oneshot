package com.letSpringCore.SpringCoreDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"com.letSpringCore.SpringCoreDemo",
		                                    "util"}
)
public class SpringCoreDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringCoreDemoApplication.class, args);
	}

}
