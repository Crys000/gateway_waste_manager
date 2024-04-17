package com.example.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WasteManagerGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(WasteManagerGatewayApplication.class, args);
	}

}
