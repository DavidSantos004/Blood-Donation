package com.example.BloodDonation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.BloodDonation.model.AnalysisResult;
import com.example.BloodDonation.model.BloodUnit;
import com.example.BloodDonation.model.Person;
import com.example.BloodDonation.repository.PersonRepository;
import com.example.BloodDonation.service.AnalysisResultService;
import com.example.BloodDonation.service.BloodUnitService;
import com.example.BloodDonation.service.PersonService;
import com.example.BloodDonation.service.TestDataGeneratorService;

@SpringBootApplication
public class BloodDonationApplication {

	public static void main(String[] args) throws ParseException {

		ConfigurableApplicationContext context = SpringApplication.run(BloodDonationApplication.class, args);

		PersonRepository personRepository = context.getBean(PersonRepository.class);

		if (personRepository.count() == 0) {
			TestDataGeneratorService testDataGeneratorService = context.getBean(TestDataGeneratorService.class);
			testDataGeneratorService.generateTestData();
		} else {
			System.out.println("La base de datos ya contiene datos, no se ejecutará TestDataGeneratorService.");
		}

		// Obtiene el servicio de personas desde el contexto de la aplicación
		PersonService personService = context.getBean(PersonService.class);
		BloodUnitService bloodUnitService = context.getBean(BloodUnitService.class);
		AnalysisResultService analysisResultService = context.getBean(AnalysisResultService.class);
		// AnalysisResultService analysisResultService = context.getBean(AnalysisResultService.class);
		// Llama a los métodos de PersonService para probarlos
		testPersonService(personService);
		testBloodUnitService(bloodUnitService);
		testAnalysisResultService(analysisResultService);

		// Cierra el contexto de la aplicación
		context.close();
	}

	// servicios de persona
	private static void testPersonService(PersonService personService) {
		// // Obtén todas las personas
		// System.out.println("Todas las personas:");
		// List<Person> allPersons = personService.getAllPersons();
		// allPersons.forEach(System.out::println);
		System.out.println("-----------------------------------------------------------------------------");
		// //Obtén una persona por ID
		// System.out.println("\nPersona con ID 1:");
		// personService.getPersonById(1).ifPresent(System.out::println);
		System.out.println("-----------------------------------------------------------------------------");
		// Guarda una nueva persona
		// System.out.println("\nGuardando nueva persona:");
		// Person newPerson = new Person();
		// newPerson.setFirst_name("Nuevo");
		// newPerson.setLast_name("Usuario");
		// newPerson.setDni("12315678");
		// newPerson.setUser_type("some_value"); // Asegúrate de establecer un valor no
		// nulo para user_type
		// newPerson.setBlood_group("A"); // Puedes establecer el grupo sanguíneo según
		// tus necesidades
		// newPerson.setRh_factor("+"); // Puedes establecer el factor Rh según tus
		// necesidades
		// newPerson.setBirthdate(new Date()); // Puedes establecer la fecha de
		// nacimiento según tus necesidades
		// newPerson.setAddress("Alguna dirección"); // Puedes establecer la dirección
		// según tus necesidades
		// newPerson.setPhone("123456789"); // Puedes establecer el teléfono según tus
		// necesidades
		// newPerson.setEmail("nuevo_usuario@example.com"); // Puedes establecer el
		// correo electrónico según tus necesidades
		// newPerson.setLast_donation(new Date()); // Puedes establecer la última
		// donación según tus necesidades
		// newPerson.setRole("some_role"); // Puedes establecer el rol según tus
		// necesidades

		// Person savedPerson = personService.savePerson(newPerson);
		// System.out.println("Persona guardada: " + savedPerson);

		// // Obtén todas las personas después de guardar la nueva
		// System.out.println("\nTodas las personas después de guardar:");
		// allPersons = personService.getAllPersons();
		// allPersons.forEach(System.out::println);
		System.out.println("-----------------------------------------------------------------------------");

		// Elimina la persona con ID 1 (cambia el ID según tus necesidades)
		// System.out.println("\nEliminando la persona con ID 22:");
		// personService.deletePerson(24);
		System.out.println("-----------------------------------------------------------------------------");

		// Obtener personas por grupo sanguíneo
		// List<Person> bloodGroupA = personService.findByBloodGroup("A");
		// bloodGroupA.forEach(System.out::println);
		System.out.println("-----------------------------------------------------------------------------");

		// CONSULTAS JPQL
		System.out.println("-----------------------------------------------------------------------------");

		// // Llama al método para obtener donantes y muestra los resultados
		// List<Person> donors = personService.getDonors();
		// System.out.println("\nDonantes:");
		// donors.forEach(System.out::println);
		// System.out.println("-----------------------------------------------------------------------------");

		// // Llama al método para obtener empleados y muestra los resultados
		// List<Person> employees = personService.getEmployees();
		// System.out.println("\nEmpleados:");
		// employees.forEach(System.out::println);
		System.out.println("-----------------------------------------------------------------------------");
	}

	private static void testBloodUnitService(BloodUnitService bloodUnitService) throws ParseException {
		// // Obtén todas las unidades de sangre
		// System.out.println("Todas las unidades de sangre:");
		// List<BloodUnit> allBloodUnits = bloodUnitService.getAllBloodUnits();
		// allBloodUnits.forEach(System.out::println);
		// System.out.println("-----------------------------------------------------------------------------");

		// // Obtén una unidad de sangre por ID
		// System.out.println("\nUnidad de sangre con ID 1:");
		// bloodUnitService.getBloodUnitById(1).ifPresent(System.out::println);
		// System.out.println("-----------------------------------------------------------------------------");

		// // Guarda una nueva unidad de sangre
		// System.out.println("\nGuardando nueva unidad de sangre:");
		// BloodUnit newBloodUnit = new BloodUnit();
		// newBloodUnit.setBlood_type("B");
		// newBloodUnit.setRh_factor("+");
		// newBloodUnit.setDonation_date(new Date());
		// newBloodUnit.setStatus("Available");
		// newBloodUnit.setVolume_content(450.0); // Puedes establecer el volumen según
		// tus necesidades
		// // Puedes establecer otras propiedades según tus necesidades

		// BloodUnit savedBloodUnit = bloodUnitService.saveBloodUnit(newBloodUnit);
		// System.out.println("Unidad de sangre guardada: " + savedBloodUnit);

		// System.out.println("-----------------------------------------------------------------------------");

		// // Elimina la unidad de sangre con ID 1 (cambia el ID según tus necesidades)
		// System.out.println("\nEliminando la unidad de sangre con ID 1:");
		// bloodUnitService.deleteBloodUnit(22);
		// System.out.println("-----------------------------------------------------------------------------");

		// // Consulta las unidades de sangre donadas en una fecha específica
		// String dateString = "2024-02-28";
		// DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		// Date specificDate = dateFormat.parse(dateString);

		// System.out.println("\nUnidades de sangre donadas en la fecha específica:");
		// List<BloodUnit> bloodUnitsByDate =
		// bloodUnitService.getBloodUnitsByDonationDate(specificDate);
		// bloodUnitsByDate.forEach(System.out::println);
		// System.out.println("-----------------------------------------------------------------------------");

		// Obtener unidades de sangre por grupo sanguíneo del donante
		// System.out.println("\nUnidades de sangre por grupo sanguíneo del donante(grupo A):");
		// List<BloodUnit> bloodUnitsByDonorBloodGroup =
		// bloodUnitService.findBloodUnitsByDonorBloodGroup("B");
		// bloodUnitsByDonorBloodGroup.forEach(System.out::println);
		// System.out.println("-----------------------------------------------------------------------------");

		// System.out.println("\nUnidades de sangre con volumen mayor a 250.0:");
		// List<BloodUnit> bloodUnitsByVolume =
		// bloodUnitService.findBloodUnitsByVolumeContentGreaterThan(250.0);
		// bloodUnitsByVolume.forEach(System.out::println);
		// System.out.println("-----------------------------------------------------------------------------");

	}

	public static void testAnalysisResultService(AnalysisResultService analysisResultService) throws ParseException{

		// 1. Get all analysis results
		// System.out.println("All analysis results:");
		// List<AnalysisResult> allBloodUnits = analysisResultService.getAllAnalysisResults();
		// allBloodUnits.forEach(System.out::println);
		// System.out.println("-----------------------------------------------------------------------------");

		// 2. Get analysis result by ID
		// System.out.println("\nAnalysis result by ID:");
		// analysisResultService.getAnalysisResultById(2).ifPresent(System.out::println);
		// System.out.println("-----------------------------------------------------------------------------");

		// 3. Save an analysis result
		// System.out.println("\nSaving an analysis result:");
		// SimpleDateFormat dates = new SimpleDateFormat("yyyy-MM-dd");

		// BloodUnit unit = new BloodUnit();
		// AnalysisResult ana = new AnalysisResult();
		// unit.setID_Unit(10);
		// Date analysisDate = dates.parse("2024-01-15");

		// ana.setUnits(unit);
		// ana.setAnalysis_type("Lipid Profile");
		// ana.setResult("Total Cholesterol: 180 mg/dL, LDL: 100 mg/dL, HDL: 50 mg/dL");
		// ana.setAnalysis_date(analysisDate);
		// ana.setObservations("A lipid profile measures cholesterol levels in the blood. Maintaining a balance between LDL and HDL is essential for heart health.");
		// // analysis.saveAnalysisResult(ana);

		// AnalysisResult savedAnalysisResult = analysisResultService.saveAnalysisResult(ana);
		// System.out.println("Analysis Result was saved " + savedAnalysisResult);
		// System.out.println("-----------------------------------------------------------------------------");

		// 4. Delete an analysis result by ID
		// System.out.println("\nDeleting an analysis result:");
		// analysisResultService.deleteAnalysisResult(22);
		// System.out.println("The analysis result was deleted");
		// System.out.println("-----------------------------------------------------------------------------");

		// 5. Show depends the type that you selected
		// System.out.println("Analysis Results by a type of it");
		// System.out.println("-----------------------------------------------------------------------------");
		// List<AnalysisResult> byType =
		// analysisResultService.findAnalysisResultByType("Blood Test");
		// for (AnalysisResult type : byType) {
		// 	System.out.println(type + "\n");
		// }
		// System.out.println("-----------------------------------------------------------------------------");

		// 6. Show depends the result that you selected
		// System.out.println("Analysis Results by a result of it");
		// System.out.println("-----------------------------------------------------------------------------");
		// List<AnalysisResult> byResult =
		// analysisResultService.findAnalysisResultByResult("High");
		// for (AnalysisResult result : byResult) {
		// 	System.out.println(result + "\n");
		// }
		// System.out.println("-----------------------------------------------------------------------------");

		// 7. Update one 
		// BloodUnit sampleBloodUnit = new BloodUnit();
		// sampleBloodUnit.setID_Unit(2);
		// Optional<List<AnalysisResult>> optionalAnalysisResults = analysisResultService.getAnalysisResultByUnits(sampleBloodUnit);

        // optionalAnalysisResults.ifPresentOrElse(
        //     analysisResults -> {
        //         if (!analysisResults.isEmpty()) {
        //             System.out.println("Analysis results found for blood unit with ID " + sampleBloodUnit + ":\n");
        //             for (AnalysisResult result : analysisResults) {
        //                 System.out.println(result + "\n");
        //             }
        //         } else {
        //             System.out.println("No analysis results found for blood unit with ID" + sampleBloodUnit + ".");
        //         }
        //     },
        //     () -> System.out.println("No analysis results found for blood unit with ID" + sampleBloodUnit + ".")
        // );
	}
}
