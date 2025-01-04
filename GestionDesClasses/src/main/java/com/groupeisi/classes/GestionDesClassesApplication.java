package com.groupeisi.classes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GestionDesClassesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionDesClassesApplication.class, args);
	}

}
