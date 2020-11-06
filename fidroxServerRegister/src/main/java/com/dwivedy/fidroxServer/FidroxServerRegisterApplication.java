package com.dwivedy.fidroxServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FidroxServerRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(FidroxServerRegisterApplication.class, args);
	}

}
