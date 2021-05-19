package com.ows.travel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
@SpringBootApplication(exclude= {SecurityAutoConfiguration.class})
public class TravelAppServiceApplication {
	
	  public static void main(String[] args) {
	        SpringApplication.run(TravelAppServiceApplication.class, args);
	    }

}
