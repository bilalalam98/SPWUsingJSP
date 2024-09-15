package com.trmab.SpringBootWebUsingJSP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWebUsingJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebUsingJspApplication.class, args);
		//but right after running it we will get the error 404 as we havent made our jsp file so lets make it
		//we have to  make sure our jsp files are in webapp folder as it look for it in that folder
		//now after making jsp file we also have to make the controller

	}

}
