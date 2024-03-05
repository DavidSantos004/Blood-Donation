package com.example.BloodDonation;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.BloodDonation.model.AnalysisResult;
import com.example.BloodDonation.model.BloodUnit;
import com.example.BloodDonation.model.DonationEvent;
import com.example.BloodDonation.model.DonationRecordEvent;
import com.example.BloodDonation.model.EventResponsiblePerson;
import com.example.BloodDonation.model.Person;
import com.example.BloodDonation.model.Transfusion;
import com.example.BloodDonation.repository.PersonRepository;
import com.example.BloodDonation.repository.TransfusionRepository;
import com.example.BloodDonation.service.AnalysisResultService;
import com.example.BloodDonation.service.BloodUnitService;
import com.example.BloodDonation.service.DonationEventService;
import com.example.BloodDonation.service.DonationRecordEventService;
import com.example.BloodDonation.service.EventResponsiblePersonService;
import com.example.BloodDonation.service.PersonService;
import com.example.BloodDonation.service.TestDataGeneratorService;
import com.example.BloodDonation.service.TransfusionService;

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
		TransfusionRepository transfusionRepository = context.getBean(TransfusionRepository.class);
		PersonService personService = context.getBean(PersonService.class);
		BloodUnitService bloodUnitService = context.getBean(BloodUnitService.class);
		AnalysisResultService analysisResultService = context.getBean(AnalysisResultService.class);
		TransfusionService transfusionService = context.getBean(TransfusionService.class);
		DonationEventService donationEventService = context.getBean(DonationEventService.class);
		DonationRecordEventService donationRecordEventService = context.getBean(DonationRecordEventService.class);
		EventResponsiblePersonService eventResponsiblePersonService = context.getBean(EventResponsiblePersonService.class);
		// AnalysisResultService analysisResultService = context.getBean(AnalysisResultService.class);
		// Llama a los métodos de PersonService para probarlos
		testPersonService(personService);
		testBloodUnitService(bloodUnitService);
		testAnalysisResultService(analysisResultService);
		testTransfusionService(transfusionService);
		testDonationEventService(donationEventService);
		testDonationRecordEventService(donationRecordEventService);
		testEventResponsiblePersonService(eventResponsiblePersonService);
		// Cierra el contexto de la aplicación
		
	}

	// servicios de persona
	 private static void testPersonService(PersonService personService) {
	// 	// // Obtén todas las personas
	// 	System.out.println("Todas las personas:");
	// 	List<Person> allPersons = personService.getAllPersons();
	// 	allPersons.forEach(System.out::println);
	// 	System.out.println("-----------------------------------------------------------------------------");
	// 	// //Obtén una persona por ID
	// 	System.out.println("\nPersona con ID 1:");
	// 	personService.getPersonById(1).ifPresent(System.out::println);
	// 	System.out.println("-----------------------------------------------------------------------------");
	// 	// Guarda una nueva persona
	// 	System.out.println("\nGuardando nueva persona:");
	// 	Person newPerson = new Person();
	// 	newPerson.setFirst_name("Nuevo");
	// 	newPerson.setLast_name("Usuario");
	// 	newPerson.setDni("12315678");
	// 	newPerson.setUser_type("some_value"); // Asegúrate de establecer un valor no nulo para user_type
	// 	newPerson.setBloodgroup("A"); // Puedes establecer el grupo sanguíneo según tus necesidades
	// 	newPerson.setRh_factor("+"); // Puedes establecer el factor Rh según tus necesidades
	// 	newPerson.setBirthdate(new Date()); // Puedes establecer la fecha de nacimiento según tus necesidades
	// 	newPerson.setAddress("Alguna dirección"); // Puedes establecer la dirección según tus necesidades
	// 	newPerson.setPhone("123456789"); // Puedes establecer el teléfono según tus necesidades
	// 	newPerson.setEmail("nuevo_usuario@example.com"); // Puedes establecer el correo electrónico según tus necesidades
	// 	newPerson.setLast_donation(new Date()); // Puedes establecer la última donación según tus necesidades
	// 	newPerson.setRole("some_role"); // Puedes establecer el rol según tus necesidades

	// 	Person savedPerson = personService.savePerson(newPerson);
	// 	System.out.println("Persona guardada: " + savedPerson);

	// 	System.out.println("-----------------------------------------------------------------------------");

	// 	// Elimina la persona con ID 1 (cambia el ID según tus necesidades)
	// 	// System.out.println("\nEliminando la persona con ID 22:");
	// 	// personService.deletePerson(24);
	// 	System.out.println("-----------------------------------------------------------------------------");

	// 	// Obtener personas por grupo sanguíneo
	// 	List<Person> bloodGroupA = personService.findByBloodGroup("A");
	// 	bloodGroupA.forEach(System.out::println);
	// 	System.out.println("-----------------------------------------------------------------------------");

	// 	// CONSULTAS JPQL
	// 	System.out.println("-----------------------------------------------------------------------------");

	// 	// // Llama al método para obtener donantes y muestra los resultados
	// 	List<Person> donors = personService.getDonors();
	// 	System.out.println("\nDonantes:");
	// 	donors.forEach(System.out::println);
	// 	System.out.println("-----------------------------------------------------------------------------");

	// 	// // Llama al método para obtener empleados y muestra los resultados
	// 	List<Person> employees = personService.getEmployees();
	// 	System.out.println("\nEmpleados:");
	// 	employees.forEach(System.out::println);
	// 	System.out.println("-----------------------------------------------------------------------------");
 }

	private static void testBloodUnitService(BloodUnitService bloodUnitService) throws ParseException {
	// 	// // Obtén todas las unidades de sangre
	// 	System.out.println("Todas las unidades de sangre:");
	// 	List<BloodUnit> allBloodUnits = bloodUnitService.getAllBloodUnits();
	// 	allBloodUnits.forEach(System.out::println);
	// 	 System.out.println("-----------------------------------------------------------------------------");

	// 	// // Obtén una unidad de sangre por ID
	// 	System.out.println("\nUnidad de sangre con ID 1:");
	// 	bloodUnitService.getBloodUnitById(1).ifPresent(System.out::println);
	// 	System.out.println("-----------------------------------------------------------------------------");

	// 	// // Guarda una nueva unidad de sangre
	// 	System.out.println("\nGuardando nueva unidad de sangre:");
	// 	BloodUnit newBloodUnit = new BloodUnit();
	// 	newBloodUnit.setBlood_type("B");
	// 	newBloodUnit.setRh_factor("+");
	// 	newBloodUnit.setDonationdate(new Date());
	// 	newBloodUnit.setStatus("Available");
	// 	newBloodUnit.setVolume_content(450.0); // Puedes establecer el volumen según tus necesidades
	// 	// Puedes establecer otras propiedades según tus necesidades

	// 	 BloodUnit savedBloodUnit = bloodUnitService.saveBloodUnit(newBloodUnit);
	// 	 System.out.println("Unidad de sangre guardada: " + savedBloodUnit);

	// 	 System.out.println("-----------------------------------------------------------------------------");

	// 	// // Elimina la unidad de sangre con ID 1 (cambia el ID según tus necesidades)
	// 	 System.out.println("\nEliminando la unidad de sangre con ID 1:");
	// 	 bloodUnitService.deleteBloodUnit(22);
	// 	 System.out.println("-----------------------------------------------------------------------------");

	// 	// // Consulta las unidades de sangre donadas en una fecha específica
	// 	 String dateString = "2024-02-28";
	// 	 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	// 	 Date specificDate = dateFormat.parse(dateString);

	// 	// System.out.println("\nUnidades de sangre donadas en la fecha específica:");
	// 	 List<BloodUnit> bloodUnitsByDate = bloodUnitService.getBloodUnitsByDonationDate(specificDate);
	// 	bloodUnitsByDate.forEach(System.out::println);
	// 	 System.out.println("-----------------------------------------------------------------------------");

	// 	// Obtener unidades de sangre por grupo sanguíneo del donante
	// 	 System.out.println("\nUnidades de sangre por grupo sanguíneo del donante(grupo A):");
	// 	 List<BloodUnit> bloodUnitsByDonorBloodGroup =
	// 	 bloodUnitService.findBloodUnitsByDonorBloodGroup("B");
	// 	 bloodUnitsByDonorBloodGroup.forEach(System.out::println);
	// 	 System.out.println("-----------------------------------------------------------------------------");

	// 	 System.out.println("\nUnidades de sangre con volumen mayor a 250.0:");
	// 	 List<BloodUnit> bloodUnitsByVolume =
	// 	 bloodUnitService.findBloodUnitsByVolumeContentGreaterThan(250.0);
	// 	 bloodUnitsByVolume.forEach(System.out::println);
	// 	 System.out.println("-----------------------------------------------------------------------------");

	}

	 public static void testAnalysisResultService(AnalysisResultService analysisResultService) throws ParseException{

	// 	// 1. Get all analysis results
	// 	// System.out.println("All analysis results:");
	// 	// List<AnalysisResult> allBloodUnits = analysisResultService.getAllAnalysisResults();
	// 	// allBloodUnits.forEach(System.out::println);
	// 	// System.out.println("-----------------------------------------------------------------------------");

	// 	// 2. Get analysis result by ID
	// 	// System.out.println("\nAnalysis result by ID:");
	// 	// analysisResultService.getAnalysisResultById(2).ifPresent(System.out::println);
	// 	// System.out.println("-----------------------------------------------------------------------------");

	// 	// 3. Save an analysis result
	// 	// System.out.println("\nSaving an analysis result:");
	// 	// SimpleDateFormat dates = new SimpleDateFormat("yyyy-MM-dd");

	// 	// BloodUnit unit = new BloodUnit();
	// 	// AnalysisResult ana = new AnalysisResult();
	// 	// unit.setID_Unit(10);
	// 	// Date analysisDate = dates.parse("2024-01-15");

	// 	// ana.setUnits(unit);
	// 	// ana.setAnalysis_type("Lipid Profile");
	// 	// ana.setResult("Total Cholesterol: 180 mg/dL, LDL: 100 mg/dL, HDL: 50 mg/dL");
	// 	// ana.setAnalysis_date(analysisDate);
	// 	// ana.setObservations("A lipid profile measures cholesterol levels in the blood. Maintaining a balance between LDL and HDL is essential for heart health.");
	// 	// // analysis.saveAnalysisResult(ana);

	// 	// AnalysisResult savedAnalysisResult = analysisResultService.saveAnalysisResult(ana);
	// 	// System.out.println("Analysis Result was saved " + savedAnalysisResult);
	// 	// System.out.println("-----------------------------------------------------------------------------");

	// 	// 4. Delete an analysis result by ID
	// 	// System.out.println("\nDeleting an analysis result:");
	// 	// analysisResultService.deleteAnalysisResult(22);
	// 	// System.out.println("The analysis result was deleted");
	// 	// System.out.println("-----------------------------------------------------------------------------");

	// 	// 5. Show depends the type that you selected
	// 	// System.out.println("Analysis Results by a type of it");
	// 	// System.out.println("-----------------------------------------------------------------------------");
	// 	// List<AnalysisResult> byType =
	// 	// analysisResultService.findAnalysisResultByType("Blood Test");
	// 	// for (AnalysisResult type : byType) {
	// 	// 	System.out.println(type + "\n");
 	//}
	// 	// System.out.println("-----------------------------------------------------------------------------");

	// 	// 6. Show depends the result that you selected
	// 	// System.out.println("Analysis Results by a result of it");
	// 	// System.out.println("-----------------------------------------------------------------------------");
	// 	// List<AnalysisResult> byResult =
	// 	// analysisResultService.findAnalysisResultByResult("High");
	// 	// for (AnalysisResult result : byResult) {
	// 	// 	System.out.println(result + "\n");
 //}
	// 	// System.out.println("-----------------------------------------------------------------------------");

	// 	// 7. Update one 
	// 	// BloodUnit sampleBloodUnit = new BloodUnit();
	// 	// sampleBloodUnit.setID_Unit(2);
	// 	// Optional<List<AnalysisResult>> optionalAnalysisResults = analysisResultService.getAnalysisResultByUnits(sampleBloodUnit);

    //     // optionalAnalysisResults.ifPresentOrElse(
    //     //     analysisResults -> {
    //     //         if (!analysisResults.isEmpty()) {
    //     //             System.out.println("Analysis results found for blood unit with ID " + sampleBloodUnit + ":\n");
    //     //             for (AnalysisResult result : analysisResults) {
    //     //                 System.out.println(result + "\n");
    //     //             }
    //     //         } else {
    //     //             System.out.println("No analysis results found for blood unit with ID" + sampleBloodUnit + ".");
    //     //         }
    //     //     },
    //     //     () -> System.out.println("No analysis results found for blood unit with ID" + sampleBloodUnit + ".")
    //     // );
	}

	public static void testTransfusionService(TransfusionService transfusionService) throws ParseException{

		// 1. Get all transfusions
		// System.out.println("The transfusions are: \n");
		// List<Transfusion> allTransfusions = transfusionService.getAllTransfusions();
		// for (Transfusion result : allTransfusions) {
		// 	System.out.println(result + "\n");
		// }
		// System.out.println("-----------------------------------------------------------------------------");

		// // 2. Get transfusions by ID
		// System.out.println("\nTransfusion by ID:\n");
		// transfusionService.getTransfusionById(5).ifPresent(System.out::println);
		// System.out.println("-----------------------------------------------------------------------------");

		// // 3. Save a transfusion 
		// System.out.println("\nSaving a transfusion:");
		// SimpleDateFormat dates = new SimpleDateFormat("yyyy-MM-dd");

		// BloodUnit unit = new BloodUnit();
		// Person staff = new Person();
		// Person receptor = new Person();
		// Transfusion transfusion = new Transfusion();
		// unit.setID_Unit(10);
		// staff.setIdperson(9);
		// receptor.setIdperson(13);
		// Date analysisDate = dates.parse("2024-01-15");
		
		// transfusion.setUnitsTransfusion(unit);
		// transfusion.setStaff(staff);
		// transfusion.setReceptor(receptor);
		// transfusion.setTransfusionDate(analysisDate);
		// transfusion.setObservations("The patient's vital signs normalized following the transfusion, suggesting a successful intervention.");
		
		// transfusionService.saveTransfusion(transfusion);
		// System.out.println("Transfusion was saved ");
		// System.out.println("-----------------------------------------------------------------------------");

		// // 4. Delete a transfusion by ID
		// System.out.println("\nDeleting transfusion:");
		// transfusionService.deleteTransfusion(22);
		// System.out.println("The transfusion was deleted");
		// System.out.println("-----------------------------------------------------------------------------");

		// // 5. Get the transfusion by blood unit
		// System.out.println("Transfusion by blood unit: \n");
		// List<Map<String, Object>> transfusionBloodUnit = transfusionService.findTransfusionInfoByUnit(12);
		// for (Map<String, Object> result : transfusionBloodUnit) {
		// 	System.out.println(result + "\n");
		// }
		// System.out.println("-----------------------------------------------------------------------------");

		// // 6. Get the transfusion by date
		// String date = "2024-03-02";
		// DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		// Date specificDate = dateFormat.parse(date);

		// System.out.println("\nTransfusion with an especific date:\n");
		// List<Transfusion> transfusionDate =
		// transfusionService.findByTransfusiondate(specificDate);
		// for (Transfusion result : transfusionDate) {
		// 	System.out.println(result + "\n");
		// }
		// System.out.println("-----------------------------------------------------------------------------");

		// // 7. Get the transfusion based on blood unit 
		// System.out.println("\nTransfusions with specific blood unit are: \n");
		// List<Map<String, Object>> results = transfusionService.findTransfusionInfoByUnit(20);

		// for (Map<String, Object> result : results) {
		// 	Integer ID_Transfusion = (Integer) result.get("ID_Transfusion");
		// 	// Date transfusionDate = (Date) result.get("transfusionDate");
		// 	String observations = (String) result.get("observations");

		// 	System.out.println("Id Transfusion: " + ID_Transfusion);
		// 	System.out.println("Transfusion Date: " + transfusionDate);
		// 	System.out.println("Observations: " + observations);
		//  System.out.println("-----------------------------------------------------------------------------");
		// }
	
        // // 8. Get relationships with transfusion ID
		// System.out.println("\nThe relationship's information are:\n");
        // List<Object[]> result = transfusionService.findCustomDataById(2);

        // for (Object[] row : result) {
        //     Integer receptorId = (Integer) row[0];
        //     Integer staffTransfusionId = (Integer) row[1];
        //     Integer unitId = (Integer) row[2];

        //     System.out.println("Receptor ID: " + receptorId + ", Staff Transfusion ID: " + staffTransfusionId + ", Unit ID: " + unitId);
        // }
		//  System.out.println("-----------------------------------------------------------------------------");
        
    }

	public static void testDonationEventService(DonationEventService donationEventService) throws ParseException{

		// 1. Get all donation events
		// System.out.println("All Donation Events:");
		// List<DonationEvent> allDonationEvents =
		// donationEventService.getAllDonationEvents();
		// for (DonationEvent type : allDonationEvents) {
		// 	System.out.println(type + "\n");
		// }
		// System.out.println("-----------------------------------------------------------------------------");

		//2. Get donation event by ID
		// System.out.println("\nDonation Event ID:");
		// donationEventService.getDonationEventById(2).ifPresent(System.out::println);
		// System.out.println("-----------------------------------------------------------------------------");

		// 3. Save an event
		// System.out.println("\nSaving an event:");
		// SimpleDateFormat dates = new SimpleDateFormat("yyyy-MM-dd");

		// DonationEvent event = new DonationEvent();
		// Date date = dates.parse("2024-04-12");

		// event.setAddress("Carrera 4 # 14-100");
		// event.setCity("Bucaramanga");
		// event.setDescription("Workplace Blood Donation Campaign - Join us in Bucaramanga for a special corporate blood donation initiative. Your participation can make a meaningful impact. Step up and contribute to this noble cause by donating blood.");
		// event.setEvent_date(date);
		// event.setStatus_event("Scheduled");
		// donationEventService.saveDonationEvent(event);

		// System.out.println("Donation Event was saved ");
		// System.out.println("-----------------------------------------------------------------------------");

		// 4. Delete an event by ID
		// System.out.println("\nDeleting a donation's event:");
		// donationEventService.deleteDonationEvent(22);
		// System.out.println("The donation's event was deleted");
		// System.out.println("-----------------------------------------------------------------------------");
		
		// 5. Get Donation Event by Status
		// System.out.println("\nDonation event by status: \n");
		// List<DonationEvent> events = donationEventService.findByStatus("Completed");
		// for (DonationEvent result : events) {
		// 	System.out.println(result + "\n");
		// }
		// System.out.println("-----------------------------------------------------------------------------");

		// 6. Get Donation Event by city
		// System.out.println("\nDonation event by city: \n");
		// List<DonationEvent> eventsCity = donationEventService.findByCity("Barranquilla");
		// for (DonationEvent result : eventsCity) {
		// 	System.out.println(result + "\n");
		// }
		// System.out.println("-----------------------------------------------------------------------------");
		
		//7. Search for asset donation events in a specific address:

		// String addressToSearch = "Carrera 7 # 32-37";
        //     List<DonationEvent> eventsByAddress = donationEventService.getEventsByAddress(addressToSearch);

        //     // Imprime los resultados
        //     System.out.println("Donation Events por dirección '" + addressToSearch + "':");
        //     eventsByAddress.forEach(System.out::println);
        //     System.out.println("-----------------------------------------------------------------------------");
       
	}
	
	 private static void testDonationRecordEventService(DonationRecordEventService donationRecordEventService) {
	// 	// Obtener todos los eventos de registro de donaciones
	// 	System.out.println("\nTodos los DonationRecordEvents:");
	// 	List<DonationRecordEvent> allDonationRecordEvents = donationRecordEventService.getAllDonationRecordEvents();
	// 	allDonationRecordEvents.forEach(System.out::println);
	// 	System.out.println("-----------------------------------------------------------------------------");
	
	// 	// Obtener un evento de registro de donaciones por ID (cambia el ID según tus necesidades)
	// 	Integer eventId = 1/* Proporciona un ID de DonationRecordEvent válido */;
	// 	System.out.println("\nDonationRecordEvent encontrado por ID (" + eventId + "):");
	// 	Optional<DonationRecordEvent> donationRecordEventById = donationRecordEventService.getDonationRecordEventById(eventId);
	// 	donationRecordEventById.ifPresent(System.out::println);
	// 	System.out.println("-----------------------------------------------------------------------------");
	// 	System.out.println("-----------------------------------------------------------------------------");
	// 	// Guardar un nuevo evento de registro de donaciones
	// 	System.out.println("\nGuardando nuevo DonationRecordEvent:");
		
	// 	// Obtén el ID de un donante, el ID de un evento de donación y el ID de una unidad de sangre válidos
	// 	Integer donorId = 1/* Proporciona el ID de un donante */;
	// 	Integer donationEventId = 1 /* Proporciona el ID de un evento de donación */;
	// 	Integer bloodUnitId = 1 /* Proporciona el ID de una unidad de sangre */;
		
	// 	// Crea un nuevo DonationRecordEvent con los IDs obtenidos
	// 	DonationRecordEvent newDonationRecordEvent = DonationRecordEvent.builder()
	// 			.donorEvent(Person.builder().idperson(donorId).build())
	// 			.events(DonationEvent.builder().ID_Event(donationEventId).build())
	// 			.unitsEvent(BloodUnit.builder().ID_Unit(bloodUnitId).build())
	// 			.build();
		
	// 	DonationRecordEvent savedDonationRecordEvent = donationRecordEventService.saveDonationRecordEvent(newDonationRecordEvent);
	// 	System.out.println("DonationRecordEvent guardado: " + savedDonationRecordEvent);
	// 	System.out.println("-----------------------------------------------------------------------------");
		
	// 	// Eliminar un evento de registro de donaciones por ID (cambia el ID según tus necesidades)
	// 	Integer deleteEventId = 1/* Proporciona un ID de DonationRecordEvent válido para eliminar */;
	// 	System.out.println("\nEliminando DonationRecordEvent por ID (" + deleteEventId + ")");
	// 	donationRecordEventService.deleteDonationRecordEvent(deleteEventId);
	// 	System.out.println("DonationRecordEvent eliminado");
	// 	System.out.println("-----------------------------------------------------------------------------");
	
	// 	// Obtén eventos de registro de donaciones por ID de donante (cambia el ID según tus necesidades)
	// 	System.out.println("\nEventos de registro de donaciones por ID de donante (ID 1):");
	// 	List<DonationRecordEvent> eventsByDonorId = donationRecordEventService.findDonationRecordEventsByDonorId(1);
	// 	eventsByDonorId.forEach(System.out::println);
	// 	System.out.println("-----------------------------------------------------------------------------");

	// 	Integer enventId = 1 /* Proporciona un ID de evento válido */;
	// 	System.out.println("\nDonationRecordEvents encontrados por ID de Evento (" + eventId + "):");
	// 	List<DonationRecordEvent> eventsByEventId = donationRecordEventService.findByEventId(eventId);
	// 	eventsByEventId.forEach(System.out::println);
	// 	System.out.println("-----------------------------------------------------------------------------");

	// 	// Obtén eventos de registro de donaciones por ID de unidad (cambia el ID según tus necesidades)
	// 	Integer unitId = 1 /* Proporciona un ID de unidad válido */;
	// 	System.out.println("\nDonationRecordEvents encontrados por ID de Unidad (" + unitId + "):");
	// 	List<DonationRecordEvent> eventsByUnitId = donationRecordEventService.findByUnitId(unitId);
	// 	eventsByUnitId.forEach(System.out::println);
	// 	System.out.println("-----------------------------------------------------------------------------");

	}

	private static void testEventResponsiblePersonService(EventResponsiblePersonService eventResponsiblePersonService) {
        
		// Obtener todos los responsables de eventos
        // System.out.println("Todos los responsables de eventos:");
        // List<EventResponsiblePerson> allResponsiblePersons = eventResponsiblePersonService.getAllEventResponsiblePersons();
        // allResponsiblePersons.forEach(System.out::println);
		// System.out.println("-----------------------------------------------------------------------------");

        // Obtener un responsable de evento por ID
        // Integer responsiblePersonId = 1; // Cambia esto con el ID que desees probar
        // System.out.println("\nResponsable de evento por ID (ID " + responsiblePersonId + "):");
        // Optional<EventResponsiblePerson> responsiblePersonById = eventResponsiblePersonService.getEventResponsiblePersonById(responsiblePersonId);
        // responsiblePersonById.ifPresent(System.out::println);
		// System.out.println("-----------------------------------------------------------------------------");

		// Supongamos que donorId es el ID de la persona que deseas asociar
		// Integer donorId = 1; // Cambia esto con el ID de la persona que deseas asociar
		// Integer eventsResponsiblePerson=1;
		// Person donorPerson = Person.builder().idperson(donorId).build();
		// DonationEvent donationEvent = DonationEvent.builder().ID_Event(eventsResponsiblePerson).build();
		// // Configura los atributos del nuevo responsable de evento según sea necesario
		// EventResponsiblePerson newResponsiblePerson = new EventResponsiblePerson();
		// newResponsiblePerson.setStaffEvent(donorPerson);
		// newResponsiblePerson.setEventsResponsible(donationEvent);

		// EventResponsiblePerson savedResponsiblePerson = eventResponsiblePersonService.saveEventResponsiblePerson(newResponsiblePerson);
		// System.out.println("\nNuevo responsable de evento guardado:");
		// System.out.println(savedResponsiblePerson);
		// System.out.println("-----------------------------------------------------------------------------");

	 	// // Elimina la responsable con ID 1 (cambia el ID según tus necesidades)
        // System.out.println("\nEliminando el nuevo responsable de evento...");
        // eventResponsiblePersonService.deleteEventResponsiblePerson(20);
        // System.out.println("Nuevo responsable de evento eliminado.");

	 	// // Llama a tus métodos de servicio y muestra los resultados en la consola
        // Integer staffId = 1; // Cambia esto con el ID que desees probar
        // System.out.println("\nEventResponsiblePersons por ID de personal (ID 1):");
        // List<EventResponsiblePerson> responsiblePersons = eventResponsiblePersonService.findEventResponsiblePersonsByStaffId(staffId);
        // responsiblePersons.forEach(System.out::println);
        // System.out.println("-----------------------------------------------------------------------------");
    
		// // Consulta 2: Encuentra todos los responsables de eventos
		// System.out.println("\nTodos los responsables de eventos:");
		// List<EventResponsiblePerson> allResponsiblePersons = eventResponsiblePersonService.findAllEventResponsiblePersons();
		// allResponsiblePersons.forEach(System.out::println);
		// System.out.println("-----------------------------------------------------------------------------");
	
		// // Consulta 3: Encuentra un responsable de evento por ID
		// Integer responsiblePersonId = 1; // Cambia esto con el ID que desees probar
		// System.out.println("\nResponsable de evento por ID (ID " + responsiblePersonId + "):");
		// Optional<EventResponsiblePerson> responsiblePersonById = eventResponsiblePersonService.findEventResponsiblePersonById(responsiblePersonId);
		// responsiblePersonById.ifPresent(System.out::println);
		// System.out.println("-----------------------------------------------------------------------------");
	
	}

}
