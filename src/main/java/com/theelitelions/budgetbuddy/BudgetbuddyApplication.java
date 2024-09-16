package com.theelitelions.budgetbuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.theelitelions.budgetbuddy")
@EnableAutoConfiguration
public class BudgetbuddyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BudgetbuddyApplication.class, args);
	}

}
