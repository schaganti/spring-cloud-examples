package io.chags.cloud.goodbyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GoodbyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodbyServiceApplication.class, args);
	}
}
