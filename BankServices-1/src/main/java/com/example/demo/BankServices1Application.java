package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankServices1Application {

	public static void main(String[] args) {
		SpringApplication.run(BankServices1Application.class, args);
		Fun();
	}
	public static void Fun() 
	{
	 System.out.println("Hello make change");	
	}
}
