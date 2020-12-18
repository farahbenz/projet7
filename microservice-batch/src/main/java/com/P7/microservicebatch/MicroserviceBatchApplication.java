package com.P7.microservicebatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@EnableFeignClients("com.P7.microservicebatch")
public class MicroserviceBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBatchApplication.class, args);
	}

}
