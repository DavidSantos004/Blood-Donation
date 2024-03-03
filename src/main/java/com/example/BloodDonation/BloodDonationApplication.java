package com.example.BloodDonation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.BloodDonation.model.AnalysisResult;
import com.example.BloodDonation.model.BloodUnit;
import com.example.BloodDonation.model.Person;
import com.example.BloodDonation.service.AnalysisResultService;
import com.example.BloodDonation.service.BloodUnitService;
import com.example.BloodDonation.service.PersonService;

@SpringBootApplication
public class BloodDonationApplication {

	public static void main(String[] args) throws ParseException {

		ConfigurableApplicationContext context = SpringApplication.run(BloodDonationApplication.class, args);
		Scanner scan = new Scanner(System.in);

		AnalysisResultService analysis = context.getBean(AnalysisResultService.class);
		BloodUnitService blood = context.getBean(BloodUnitService.class);
		PersonService person = context.getBean(PersonService.class);
		SimpleDateFormat dates = new SimpleDateFormat("yyyy-MM-dd");


		// Create person
		Date now = new Date();
		Person persona = new Person();

		// Date birth = dates.parse("2006-01-05");
		// Date donation = dates.parse("2024-01-05");
	
		// persona.setFirst_name("Nathalia");
		// persona.setLast_name("Cardenas");
		// persona.setDni("102365478");
		// persona.setUser_type("Donor");
		// persona.setBlood_group("A");
		// persona.setRh_factor("+");
		// persona.setBirthdate(birth);
		// persona.setAddress("Poblado");
		// persona.setPhone("3227854119");
		// persona.setEmail("angie@gmail.com");
		// persona.setLast_donation(donation);
		// persona.setRole(null);
		// person.savePerson(persona);

		// Create blood units
		BloodUnit unit = new BloodUnit();
		Person donor = new Person();
		// donor.setID_person(1);

		// unit.setDonor(donor);
		// unit.setBlood_type("O");
		// unit.setRh_factor("-");
		// unit.setDonation_date(now);
		// unit.setStatus("Filtered");
		// unit.setVolume_content(null);
		// blood.saveBloodUnit(unit);

		// Create analysis
		
		unit.setID_Unit(1);
		AnalysisResult ana = new AnalysisResult();
		Date analysisDate = dates.parse("2024-01-02");

		ana.setUnits(unit);
		ana.setAnalysis_type("Coagulation");
		ana.setResult("Prothrombin Time: 11-13.5 seconds");
		ana.setAnalysis_date(analysisDate);
		ana.setObservations("Prothrombin time measures the time it takes for blood to clot. A normal result indicates adequate clotting capacity. If the result is prolonged, it could indicate a risk of bleeding.");
		analysis.saveAnalysisResult(ana);

	}

}
