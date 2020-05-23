package com.P7.microserviceouvrages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceOuvragesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceOuvragesApplication.class, args);
	}

}
