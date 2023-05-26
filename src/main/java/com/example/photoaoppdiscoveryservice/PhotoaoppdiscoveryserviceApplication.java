package com.example.photoaoppdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PhotoaoppdiscoveryserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoaoppdiscoveryserviceApplication.class, args);
	}

}
