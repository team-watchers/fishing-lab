package com.teamwatchers.fishinglab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.teamwatchers.fishinglab.*"})
public class FishingLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(FishingLabApplication.class, args);
	}

}
