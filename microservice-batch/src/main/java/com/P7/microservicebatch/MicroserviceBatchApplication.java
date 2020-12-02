package com.P7.microservicebatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MicroserviceBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBatchApplication.class, args);
	}

}
