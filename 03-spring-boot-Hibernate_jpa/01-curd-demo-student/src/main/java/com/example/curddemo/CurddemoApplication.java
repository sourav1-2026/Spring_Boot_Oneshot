package com.example.curddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CurddemoApplication
{

	public static void main(String[] args) {

		SpringApplication.run(CurddemoApplication.class, args);
	}

//	Defineing new Bean for command line Runner
//	it will run when spring create the bean
	@Bean
	public CommandLineRunner commandLineRunner(String[] args){
		return  runner -> {
			System.out.println("Hello world");
		};
	}


}
