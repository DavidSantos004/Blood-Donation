package com.example.BloodDonation;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.BloodDonation.model.Person;
import com.example.BloodDonation.repository.PersonRepository;
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

        // Llama a los métodos de PersonService para probarlos
        testPersonService(personService);

        // Cierra el contexto de la aplicación
        context.close();
    }

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
		// newPerson.setUser_type("some_value"); // Asegúrate de establecer un valor no nulo para user_type
		// newPerson.setBlood_group("A"); // Puedes establecer el grupo sanguíneo según tus necesidades
		// newPerson.setRh_factor("+"); // Puedes establecer el factor Rh según tus necesidades
		// newPerson.setBirthdate(new Date()); // Puedes establecer la fecha de nacimiento según tus necesidades
		// newPerson.setAddress("Alguna dirección"); // Puedes establecer la dirección según tus necesidades
		// newPerson.setPhone("123456789"); // Puedes establecer el teléfono según tus necesidades
		// newPerson.setEmail("nuevo_usuario@example.com"); // Puedes establecer el correo electrónico según tus necesidades
		// newPerson.setLast_donation(new Date()); // Puedes establecer la última donación según tus necesidades
		// newPerson.setRole("some_role"); // Puedes establecer el rol según tus necesidades

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

		//CONSULTAS JPQL

		 // Llama al método para obtener donantes y muestra los resultados
		 List<Person> donors = personService.getDonors();
		 System.out.println("\nDonantes:");
		 donors.forEach(System.out::println);
 
		 // Llama al método para obtener empleados y muestra los resultados
		 List<Person> employees = personService.getEmployees();
		 System.out.println("\nEmpleados:");
		 employees.forEach(System.out::println);

	}
}

