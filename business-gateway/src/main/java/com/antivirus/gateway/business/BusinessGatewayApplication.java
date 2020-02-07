package com.antivirus.gateway.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.archaius.ArchaiusAutoConfiguration;

@SpringBootApplication(exclude = ArchaiusAutoConfiguration.class)
@EnableDiscoveryClient
public class BusinessGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusinessGatewayApplication.class, args);
	}

}
