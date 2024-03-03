package com.example.BloodDonation;

import java.text.ParseException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.BloodDonation.service.TestDataGeneratorService;






@SpringBootApplication
public class BloodDonationApplication {

	public static void main(String[] args) throws ParseException {

		ConfigurableApplicationContext context = SpringApplication.run(BloodDonationApplication.class, args);
		
		TestDataGeneratorService testDataGeneratorService = context.getBean(TestDataGeneratorService.class);

		testDataGeneratorService.generateTestData();
	}

}
