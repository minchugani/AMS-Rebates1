package com.walmart.rebates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.rebates.utils.Repo;

@RestController
@SpringBootApplication
@ComponentScan("com.walmart.rebates")
@EntityScan("com.walmart.rebates.entities")
public class RebatesV2SpringBootApplication {
	@Autowired
	private Repo repoProd ;
	public static void main(String[] args) {
		SpringApplication.run(RebatesV2SpringBootApplication.class, args);
		
		
	}
	
	

}
