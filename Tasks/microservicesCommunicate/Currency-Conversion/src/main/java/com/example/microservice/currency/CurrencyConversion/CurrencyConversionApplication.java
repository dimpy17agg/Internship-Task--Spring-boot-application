package com.example.microservice.currency.CurrencyConversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.example.microservice.currency.CurrencyConversion")

public class CurrencyConversionApplication {
		public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionApplication.class, args);
	}

}
