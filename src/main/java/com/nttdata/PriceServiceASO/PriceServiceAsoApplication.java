package com.nttdata.PriceServiceASO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PriceServiceAsoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PriceServiceAsoApplication.class, args);
	}

}
