package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	    	 ConvertNumberToWords obj = new ConvertNumberToWords();
	    	 System.out.println("PLEASE ENTER NUMBER YOU WANT TO CONVERT TO WORDS");
	         Scanner in = new Scanner(System.in);
	         int s = in.nextInt();
	         System.out.println("THE ENTERED NUMBER IN WORDS ::: "+obj.convert(s));
	}
}