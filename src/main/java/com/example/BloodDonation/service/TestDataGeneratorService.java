package com.example.BloodDonation.service;

import com.example.BloodDonation.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.*;

@Service
public class TestDataGeneratorService {

        private final PersonService personService;
        private final BloodUnitService bloodUnitService;
        private final AnalysisResultService analysisResultService;
        private final DonationEventService donationEventService;
        private final DonationRecordEventService donationRecordEventService;
        private final EventResponsiblePersonService eventResponsiblePersonService;
        private final TransfusionService transfusionService;

        @Autowired
        public TestDataGeneratorService(
                        PersonService personService,
                        BloodUnitService bloodUnitService,
                        AnalysisResultService analysisResultService,
                        DonationEventService donationEventService,
                        DonationRecordEventService donationRecordEventService,
                        EventResponsiblePersonService eventResponsiblePersonService,
                        TransfusionService transfusionService) {
                this.personService = personService;
                this.bloodUnitService = bloodUnitService;
                this.analysisResultService = analysisResultService;
                this.donationEventService = donationEventService;
                this.donationRecordEventService = donationRecordEventService;
                this.eventResponsiblePersonService = eventResponsiblePersonService;
                this.transfusionService = transfusionService;
        }

        public void generateTestData() throws ParseException {
                generatePersons();
                generateBloodUnits();
                generateAnalysisResults();
                generateDonationEvents();
                generateDonationRecordEvents();
                generateEventResponsiblePersons();
                generateTransfusions();
        }

        private void generatePersons() throws ParseException {

                Date birth = new SimpleDateFormat("yyyy-MM-dd").parse("2000-01-01");
                Date donation = new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-01");

                Person person = Person.builder()
                                .first_name("John")
                                .last_name("Doe")
                                .dni("123156789")
                                .user_type("Donor")
                                .blood_group("A")
                                .rh_factor("+")
                                .birthdate(birth)
                                .address("El carrizal")
                                .phone("1224567890")
                                .email("john@example.com")
                                .last_donation(donation)
                                .role(null)
                                .build();

                personService.savePerson(person);

                // Persona 1
                Date birth1 = new SimpleDateFormat("yyyy-MM-dd").parse("1995-05-10");
                Date donation1 = new SimpleDateFormat("yyyy-MM-dd").parse("2021-08-20");

                Person person1 = Person.builder()
                                .first_name("Alice")
                                .last_name("Smith")
                                .dni("981644321")
                                .user_type("Donor")
                                .blood_group("B")
                                .rh_factor("-")
                                .birthdate(birth1)
                                .address("123 Main St")
                                .phone("5551234567")
                                .email("alice@example.com")
                                .last_donation(donation1)
                                .role(null)
                                .build();

                personService.savePerson(person1);

                // Persona 2
                Date birth2 = new SimpleDateFormat("yyyy-MM-dd").parse("1988-12-05");

                Person person2 = Person.builder()
                                .first_name("Bob")
                                .last_name("Johnson")
                                .dni("876543210")
                                .user_type("Employee")
                                .blood_group("O")
                                .rh_factor("+")
                                .birthdate(birth2)
                                .address("456 Oak St")
                                .phone("5559876543")
                                .email("bob@example.com")
                                .last_donation(null)
                                .role("Nurse")
                                .build();

                personService.savePerson(person2);

                Date birth3 = new SimpleDateFormat("yyyy-MM-dd").parse("1990-08-22");
                Date donation3 = new SimpleDateFormat("yyyy-MM-dd").parse("2022-02-28");

                Person person3 = Person.builder()
                                .first_name("Charlie")
                                .last_name("Brown")
                                .dni("765432109")
                                .user_type("Receptor")
                                .blood_group("AB")
                                .rh_factor("-")
                                .birthdate(birth3)
                                .address("789 Pine St")
                                .phone("5552314244")
                                .email("charlie@example.com")
                                .last_donation(donation3)
                                .role(null)
                                .build();

                personService.savePerson(person3);

                // Persona 4
                Date birth4 = new SimpleDateFormat("yyyy-MM-dd").parse("1985-04-18");
                Date donation4 = new SimpleDateFormat("yyyy-MM-dd").parse("2021-10-05");

                Person person4 = Person.builder()
                                .first_name("David")
                                .last_name("Wilson")
                                .dni("654321098")
                                .user_type("Donor")
                                .blood_group("A")
                                .rh_factor("+")
                                .birthdate(birth4)
                                .address("987 Elm St")
                                .phone("5556789012")
                                .email("david@example.com")
                                .last_donation(donation4)
                                .role(null)
                                .build();

                personService.savePerson(person4);

                // Persona 5
                Date birth5 = new SimpleDateFormat("yyyy-MM-dd").parse("1992-11-30");

                Person person5 = Person.builder()
                                .first_name("Emma")
                                .last_name("Miller")
                                .dni("543210987")
                                .user_type("Employee")
                                .blood_group("B")
                                .rh_factor("-")
                                .birthdate(birth5)
                                .address("456 Maple St")
                                .phone("5555552555")
                                .email("ema@example.com")
                                .last_donation(null)
                                .role("Manager")
                                .build();

                personService.savePerson(person5);

                // Persona 6
                Date birth6 = new SimpleDateFormat("yyyy-MM-dd").parse("1980-07-15");
                Date donation6 = new SimpleDateFormat("yyyy-MM-dd").parse("2021-12-10");

                Person person6 = Person.builder()
                                .first_name("Grace")
                                .last_name("Turner")
                                .dni("432109876")
                                .user_type("Receptor")
                                .blood_group("O")
                                .rh_factor("+")
                                .birthdate(birth6)
                                .address("123 Birch St")
                                .phone("5551112222")
                                .email("grace@example.com")
                                .last_donation(donation6)
                                .role(null)
                                .build();

                personService.savePerson(person6);
                // Persona 7
                Date birth7 = new SimpleDateFormat("yyyy-MM-dd").parse("1995-08-25");
                Date donation7 = new SimpleDateFormat("yyyy-MM-dd").parse("2022-02-05");

                Person person7 = Person.builder()
                                .first_name("Sophia")
                                .last_name("Smith")
                                .dni("987654321")
                                .user_type("Donor")
                                .blood_group("AB")
                                .rh_factor("-")
                                .birthdate(birth7)
                                .address("789 Oak St")
                                .phone("2557334444")
                                .email("sopia@example.com")
                                .last_donation(donation7)
                                .role(null)
                                .build();

                personService.savePerson(person7);

                // Persona 8
                Date birth8 = new SimpleDateFormat("yyyy-MM-dd").parse("1988-03-12");

                Person person8 = Person.builder()
                                .first_name("Daniel")
                                .last_name("Brown")
                                .dni("876543219")
                                .user_type("Employee")
                                .blood_group("A")
                                .rh_factor("+")
                                .birthdate(birth8)
                                .address("567 Pine St")
                                .phone("5552778888")
                                .email("daniel002@example.com")
                                .last_donation(null)
                                .role("Nurse")
                                .build();

                personService.savePerson(person8);

                // Persona 9
                Date birth9 = new SimpleDateFormat("yyyy-MM-dd").parse("1990-05-08");
                Date donation9 = new SimpleDateFormat("yyyy-MM-dd").parse("2022-03-01");

                Person person9 = Person.builder()
                                .first_name("Olivia")
                                .last_name("Johnson")
                                .dni("765432198")
                                .user_type("Receptor")
                                .blood_group("B")
                                .rh_factor("-")
                                .birthdate(birth9)
                                .address("345 Cedar St")
                                .phone("5559990000")
                                .email("olivia@example.com")
                                .last_donation(donation9)
                                .role(null)
                                .build();

                personService.savePerson(person9);

                // Persona 10
                Date birth10 = new SimpleDateFormat("yyyy-MM-dd").parse("1993-12-18");
                Date donation10 = new SimpleDateFormat("yyyy-MM-dd").parse("2022-02-20");

                Person person10 = Person.builder()
                                .first_name("Ethan")
                                .last_name("Miller")
                                .dni("654321987")
                                .user_type("Donor")
                                .blood_group("O")
                                .rh_factor("+")
                                .birthdate(birth10)
                                .address("901 Elm St")
                                .phone("5551314222")
                                .email("ethan@example.com")
                                .last_donation(donation10)
                                .role(null)
                                .build();

                personService.savePerson(person10);

                // Persona 11
                Date birth11 = new SimpleDateFormat("yyyy-MM-dd").parse("1985-09-25");

                Person person11 = Person.builder()
                                .first_name("Sophia")
                                .last_name("Jones")
                                .dni("789456123")
                                .user_type("Employee")
                                .blood_group("AB")
                                .rh_factor("-")
                                .birthdate(birth11)
                                .address("702 Oak St")
                                .phone("5553334444")
                                .email("sohia@example.com")
                                .last_donation(null)
                                .role("Nurse")
                                .build();

                personService.savePerson(person11);

                // Persona 12
                Date birth12 = new SimpleDateFormat("yyyy-MM-dd").parse("1990-06-14");

                Person person12 = Person.builder()
                                .first_name("Liam")
                                .last_name("Garcia")
                                .dni("963258741")
                                .user_type("Receptor")
                                .blood_group("B")
                                .rh_factor("+")
                                .birthdate(birth12)
                                .address("405 Pine St")
                                .phone("5555555555")
                                .email("liam@example.com")
                                .last_donation(null)
                                .role(null)
                                .build();

                personService.savePerson(person12);

                // Persona 13
                Date birth13 = new SimpleDateFormat("yyyy-MM-dd").parse("1980-03-08");
                Date donation13 = new SimpleDateFormat("yyyy-MM-dd").parse("2022-02-28");

                Person person13 = Person.builder()
                                .first_name("Ava")
                                .last_name("Smith")
                                .dni("159753468")
                                .user_type("Donor")
                                .blood_group("A")
                                .rh_factor("-")
                                .birthdate(birth13)
                                .address("601 Maple St")
                                .phone("5556667777")
                                .email("ava@example.com")
                                .last_donation(donation13)
                                .role(null)
                                .build();

                personService.savePerson(person13);

                // Persona 14
                Date birth14 = new SimpleDateFormat("yyyy-MM-dd").parse("1998-11-30");
                Date donation14 = new SimpleDateFormat("yyyy-MM-dd").parse("2021-11-15");

                Person person14 = Person.builder()
                                .first_name("Oliver")
                                .last_name("Johnson")
                                .dni("357159852")
                                .user_type("Donor")
                                .blood_group("O")
                                .rh_factor("+")
                                .birthdate(birth14)
                                .address("804 Birch St")
                                .phone("5558889999")
                                .email("oliver@example.com")
                                .last_donation(donation14)
                                .role(null)
                                .build();

                personService.savePerson(person14);

                // Persona 15
                Date birth15 = new SimpleDateFormat("yyyy-MM-dd").parse("1995-07-18");
                Date donation15 = new SimpleDateFormat("yyyy-MM-dd").parse("2022-04-02");

                Person person15 = Person.builder()
                                .first_name("Emma")
                                .last_name("Brown")
                                .dni("951753684")
                                .user_type("Receptor")
                                .blood_group("AB")
                                .rh_factor("+")
                                .birthdate(birth15)
                                .address("208 Elm St")
                                .phone("5552221111")
                                .email("emma@example.com")
                                .last_donation(donation15)
                                .role(null)
                                .build();

                personService.savePerson(person15);

                // Persona 16
                Date birth16 = new SimpleDateFormat("yyyy-MM-dd").parse("1987-04-05");
                Date donation16 = new SimpleDateFormat("yyyy-MM-dd").parse("2022-03-20");

                Person person16 = Person.builder()
                                .first_name("Mia")
                                .last_name("Davis")
                                .dni("246813579")
                                .user_type("Donor")
                                .blood_group("B")
                                .rh_factor("-")
                                .birthdate(birth16)
                                .address("305 Oak St")
                                .phone("5553336666")
                                .email("mia@example.com")
                                .last_donation(donation16)
                                .role(null)
                                .build();

                personService.savePerson(person16);

                // Persona 17
                Date birth17 = new SimpleDateFormat("yyyy-MM-dd").parse("1982-12-10");

                Person person17 = Person.builder()
                                .first_name("Jackson")
                                .last_name("Martinez")
                                .dni("864209753")
                                .user_type("Employee")
                                .blood_group("O")
                                .rh_factor("+")
                                .birthdate(birth17)
                                .address("504 Pine St")
                                .phone("5554447777")
                                .email("jackson@example.com")
                                .last_donation(null)
                                .role("Manager")
                                .build();

                personService.savePerson(person17);

                // Persona 18
                Date birth18 = new SimpleDateFormat("yyyy-MM-dd").parse("1993-09-02");
                Date donation18 = new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-10");

                Person person18 = Person.builder()
                                .first_name("Sophie")
                                .last_name("Miller")
                                .dni("578943621")
                                .user_type("Donor")
                                .blood_group("A")
                                .rh_factor("-")
                                .birthdate(birth18)
                                .address("107 Maple St")
                                .phone("5557778888")
                                .email("sophie@example.com")
                                .last_donation(donation18)
                                .role(null)
                                .build();

                personService.savePerson(person18);

                // Persona 19
                Date birth19 = new SimpleDateFormat("yyyy-MM-dd").parse("1990-04-15");

                Person person19 = Person.builder()
                                .first_name("Sophia")
                                .last_name("Rodriguez")
                                .dni("732145698")
                                .user_type("Employee")
                                .blood_group("B")
                                .rh_factor("+")
                                .birthdate(birth19)
                                .address("421 Elm St")
                                .phone("5551112233")
                                .email("sophia@example.com")
                                .last_donation(null)
                                .role("Nurse")
                                .build();

                personService.savePerson(person19);

                // Persona 20
                Date birth20 = new SimpleDateFormat("yyyy-MM-dd").parse("1982-07-25");
                Date donation20 = new SimpleDateFormat("yyyy-MM-dd").parse("2022-04-18");

                Person person20 = Person.builder()
                                .first_name("Daniel")
                                .last_name("Taylor")
                                .dni("896523147")
                                .user_type("Receptor")
                                .blood_group("AB")
                                .rh_factor("-")
                                .birthdate(birth20)
                                .address("502 Maple St")
                                .phone("5554445678")
                                .email("daniel@example.com")
                                .last_donation(donation20)
                                .role(null)
                                .build();

                personService.savePerson(person20);
        }

        private void generateBloodUnits() throws ParseException {
                SimpleDateFormat dates = new SimpleDateFormat("yyyy-MM-dd");
                Date maybe = dates.parse("2024-03-01");
                Date maybe2 = dates.parse("2024-02-28");

                Person donor = personService.getPersonById(1).orElse(null);
                if (donor != null) {
                        BloodUnit bloodUnit = BloodUnit.builder()
                                        .donor(donor)
                                        .blood_type("A")
                                        .rh_factor("+")
                                        .donation_date(maybe)
                                        .status("Filtered")
                                        .volume_content(0.0)
                                        .build();
                        bloodUnitService.saveBloodUnit(bloodUnit);
                }
                // Unidad de sangre 2
                Person donor2 = personService.getPersonById(2).orElse(null);
                if (donor2 != null) {
                        BloodUnit bloodUnit2 = BloodUnit.builder()
                                        .donor(donor2)
                                        .blood_type("B")
                                        .rh_factor("-")
                                        .donation_date(maybe2)
                                        .status("Processed")
                                        .volume_content(250.0)
                                        .build();
                        bloodUnitService.saveBloodUnit(bloodUnit2);
                }

                // Unidad de sangre 3
                Person donor3 = personService.getPersonById(5).orElse(null);
                if (donor3 != null) {
                        BloodUnit bloodUnit3 = BloodUnit.builder()
                                        .donor(donor3)
                                        .blood_type("A")
                                        .rh_factor("+")
                                        .donation_date(new Date())
                                        .status("Stored")
                                        .volume_content(200.0)
                                        .build();
                        bloodUnitService.saveBloodUnit(bloodUnit3);
                }

                // Unidad de sangre 4
                Person donor4 = personService.getPersonById(8).orElse(null);
                if (donor4 != null) {
                        BloodUnit bloodUnit4 = BloodUnit.builder()
                                        .donor(donor4)
                                        .blood_type("AB")
                                        .rh_factor("-")
                                        .donation_date(maybe)
                                        .status("Shipped")
                                        .volume_content(300.0)
                                        .build();
                        bloodUnitService.saveBloodUnit(bloodUnit4);
                }

                // Unidad de sangre 5
                Person donor5 = personService.getPersonById(11).orElse(null);
                if (donor5 != null) {
                        BloodUnit bloodUnit5 = BloodUnit.builder()
                                        .donor(donor5)
                                        .blood_type("O")
                                        .rh_factor("+")
                                        .donation_date(maybe2)
                                        .status("Expired")
                                        .volume_content(150.0)
                                        .build();
                        bloodUnitService.saveBloodUnit(bloodUnit5);
                }

                // Unidad de sangre 6
                Person donor6 = personService.getPersonById(14).orElse(null);
                if (donor6 != null) {
                        BloodUnit bloodUnit6 = BloodUnit.builder()
                                        .donor(donor6)
                                        .blood_type("A")
                                        .rh_factor("-")
                                        .donation_date(new Date())
                                        .status("Delivered")
                                        .volume_content(180.0)
                                        .build();
                        bloodUnitService.saveBloodUnit(bloodUnit6);
                }
                // Unidad de sangre 7
                Person donor7 = personService.getPersonById(15).orElse(null);
                if (donor7 != null) {
                        BloodUnit bloodUnit7 = BloodUnit.builder()
                                        .donor(donor7)
                                        .blood_type("O")
                                        .rh_factor("+")
                                        .donation_date(maybe)
                                        .status("Filtered")
                                        .volume_content(220.0)
                                        .build();
                        bloodUnitService.saveBloodUnit(bloodUnit7);
                }

                // Unidad de sangre 8
                Person donor8 = personService.getPersonById(17).orElse(null);
                if (donor8 != null) {
                        BloodUnit bloodUnit8 = BloodUnit.builder()
                                        .donor(donor8)
                                        .blood_type("B")
                                        .rh_factor("-")
                                        .donation_date(maybe2)
                                        .status("Processed")
                                        .volume_content(270.0)
                                        .build();
                        bloodUnitService.saveBloodUnit(bloodUnit8);
                }

                // Unidad de sangre 9
                Person donor9 = personService.getPersonById(19).orElse(null);
                if (donor9 != null) {
                        BloodUnit bloodUnit9 = BloodUnit.builder()
                                        .donor(donor9)
                                        .blood_type("A")
                                        .rh_factor("-")
                                        .donation_date(new Date())
                                        .status("Stored")
                                        .volume_content(190.0)
                                        .build();
                        bloodUnitService.saveBloodUnit(bloodUnit9);
                }

                // Unidad de sangre 10
                Person donor10 = personService.getPersonById(19).orElse(null);
                if (donor10 != null) {
                        BloodUnit bloodUnit10 = BloodUnit.builder()
                                        .donor(donor10)
                                        .blood_type("A")
                                        .rh_factor("-")
                                        .donation_date(maybe)
                                        .status("Shipped")
                                        .volume_content(320.0)
                                        .build();
                        bloodUnitService.saveBloodUnit(bloodUnit10);
                }

                // Unidad de sangre 11
                Person donor11 = personService.getPersonById(17).orElse(null);
                if (donor11 != null) {
                        BloodUnit bloodUnit11 = BloodUnit.builder()
                                        .donor(donor11)
                                        .blood_type("B")
                                        .rh_factor("-")
                                        .donation_date(maybe2)
                                        .status("Expired")
                                        .volume_content(130.0)
                                        .build();
                        bloodUnitService.saveBloodUnit(bloodUnit11);
                }

                // Unidad de sangre 12
                Person donor12 = personService.getPersonById(15).orElse(null);
                if (donor12 != null) {
                        BloodUnit bloodUnit12 = BloodUnit.builder()
                                        .donor(donor12)
                                        .blood_type("O")
                                        .rh_factor("+")
                                        .donation_date(new Date())
                                        .status("Delivered")
                                        .volume_content(250.0)
                                        .build();
                        bloodUnitService.saveBloodUnit(bloodUnit12);
                }
                // Unidad de sangre 13
                Person donor13 = personService.getPersonById(14).orElse(null);
                if (donor13 != null) {
                        BloodUnit bloodUnit13 = BloodUnit.builder()
                                        .donor(donor13)
                                        .blood_type("A")
                                        .rh_factor("-")
                                        .donation_date(maybe)
                                        .status("Filtered")
                                        .volume_content(180.0)
                                        .build();
                        bloodUnitService.saveBloodUnit(bloodUnit13);
                }

                // Unidad de sangre 14
                Person donor14 = personService.getPersonById(11).orElse(null);
                if (donor14 != null) {
                        BloodUnit bloodUnit14 = BloodUnit.builder()
                                        .donor(donor14)
                                        .blood_type("O")
                                        .rh_factor("+")
                                        .donation_date(maybe2)
                                        .status("Processed")
                                        .volume_content(240.0)
                                        .build();
                        bloodUnitService.saveBloodUnit(bloodUnit14);
                }

                // Unidad de sangre 15
                Person donor15 = personService.getPersonById(8).orElse(null);
                if (donor15 != null) {
                        BloodUnit bloodUnit15 = BloodUnit.builder()
                                        .donor(donor15)
                                        .blood_type("AB")
                                        .rh_factor("-")
                                        .donation_date(new Date())
                                        .status("Stored")
                                        .volume_content(200.0)
                                        .build();
                        bloodUnitService.saveBloodUnit(bloodUnit15);
                }

                // Unidad de sangre 16
                Person donor16 = personService.getPersonById(5).orElse(null);
                if (donor16 != null) {
                        BloodUnit bloodUnit16 = BloodUnit.builder()
                                        .donor(donor16)
                                        .blood_type("A")
                                        .rh_factor("+")
                                        .donation_date(maybe)
                                        .status("Shipped")
                                        .volume_content(300.0)
                                        .build();
                        bloodUnitService.saveBloodUnit(bloodUnit16);
                }

                // Unidad de sangre 17
                Person donor17 = personService.getPersonById(2).orElse(null);
                if (donor17 != null) {
                        BloodUnit bloodUnit17 = BloodUnit.builder()
                                        .donor(donor17)
                                        .blood_type("B")
                                        .rh_factor("-")
                                        .donation_date(maybe2)
                                        .status("Expired")
                                        .volume_content(150.0)
                                        .build();
                        bloodUnitService.saveBloodUnit(bloodUnit17);
                }

                // Unidad de sangre 18
                Person donor18 = personService.getPersonById(1).orElse(null);
                if (donor18 != null) {
                        BloodUnit bloodUnit18 = BloodUnit.builder()
                                        .donor(donor18)
                                        .blood_type("A")
                                        .rh_factor("+")
                                        .donation_date(new Date())
                                        .status("Delivered")
                                        .volume_content(270.0)
                                        .build();
                        bloodUnitService.saveBloodUnit(bloodUnit18);
                }
                // Unidad de sangre 19
                Person donor19 = personService.getPersonById(15).orElse(null);
                if (donor19 != null) {
                        BloodUnit bloodUnit19 = BloodUnit.builder()
                                        .donor(donor19)
                                        .blood_type("O")
                                        .rh_factor("+")
                                        .donation_date(maybe)
                                        .status("Filtered")
                                        .volume_content(190.0)
                                        .build();
                        bloodUnitService.saveBloodUnit(bloodUnit19);
                }

                // Unidad de sangre 20
                Person donor20 = personService.getPersonById(8).orElse(null);
                if (donor20 != null) {
                        BloodUnit bloodUnit20 = BloodUnit.builder()
                                        .donor(donor20)
                                        .blood_type("AB")
                                        .rh_factor("-")
                                        .donation_date(new Date())
                                        .status("Processed")
                                        .volume_content(220.0)
                                        .build();
                        bloodUnitService.saveBloodUnit(bloodUnit20);
                }
        }

        private void generateAnalysisResults() {

                BloodUnit bloodUnit = bloodUnitService.getBloodUnitById(1).orElse(null);
                if (bloodUnit != null) {
                        LocalDateTime analysisDate = LocalDateTime.of(2023, 6, 15, 10, 30);
                        AnalysisResult analysisResult = AnalysisResult.builder()
                                        .units(bloodUnit)
                                        .analysis_type("Blood Test")
                                        .result("Normal")
                                        .analysis_date(Date
                                                        .from(analysisDate.atZone(ZoneId.systemDefault()).toInstant()))
                                        .observations("No observations")
                                        .build();
                        analysisResultService.saveAnalysisResult(analysisResult);
                }

                // Resultado de análisis 1
                BloodUnit bloodUnit1 = bloodUnitService.getBloodUnitById(2).orElse(null);
                if (bloodUnit1 != null) {
                        LocalDateTime analysisDate1 = LocalDateTime.of(2024, 2, 11, 11, 45);
                        AnalysisResult analysisResult1 = AnalysisResult.builder()
                                        .units(bloodUnit1)
                                        .analysis_type("Blood Test")
                                        .result("Normal")
                                        .analysis_date(Date
                                                        .from(analysisDate1.atZone(ZoneId.systemDefault()).toInstant()))
                                        .observations("No observations")
                                        .build();
                        analysisResultService.saveAnalysisResult(analysisResult1);
                }

                // Resultado de análisis 2
                BloodUnit bloodUnit2 = bloodUnitService.getBloodUnitById(2).orElse(null);
                if (bloodUnit2 != null) {
                        LocalDateTime analysisDate2 = LocalDateTime.of(2024, 2, 3, 10, 30);
                        AnalysisResult analysisResult2 = AnalysisResult.builder()
                                        .units(bloodUnit2)
                                        .analysis_type("Cholesterol Test")
                                        .result("High")
                                        .analysis_date(Date
                                                        .from(analysisDate2.atZone(ZoneId.systemDefault()).toInstant()))
                                        .observations("High cholesterol levels")
                                        .build();
                        analysisResultService.saveAnalysisResult(analysisResult2);
                }

                // Resultado de análisis 3
                BloodUnit bloodUnit3 = bloodUnitService.getBloodUnitById(3).orElse(null);
                if (bloodUnit3 != null) {
                        LocalDateTime analysisDate3 = LocalDateTime.of(2024, 8, 4, 12, 45);
                        AnalysisResult analysisResult3 = AnalysisResult.builder()
                                        .units(bloodUnit3)
                                        .analysis_type("Blood Sugar Test")
                                        .result("Normal")
                                        .analysis_date(Date
                                                        .from(analysisDate3.atZone(ZoneId.systemDefault()).toInstant()))
                                        .observations("No observations")
                                        .build();
                        analysisResultService.saveAnalysisResult(analysisResult3);
                }

                // Resultado de análisis 4
                BloodUnit bloodUnit4 = bloodUnitService.getBloodUnitById(4).orElse(null);
                if (bloodUnit4 != null) {
                        LocalDateTime analysisDate4 = LocalDateTime.of(2024, 6, 5, 15, 15);
                        AnalysisResult analysisResult4 = AnalysisResult.builder()
                                        .units(bloodUnit4)
                                        .analysis_type("Iron Levels Test")
                                        .result("Low")
                                        .analysis_date(Date
                                                        .from(analysisDate4.atZone(ZoneId.systemDefault()).toInstant()))
                                        .observations("Low iron levels")
                                        .build();
                        analysisResultService.saveAnalysisResult(analysisResult4);
                }

                // Resultado de análisis 5
                BloodUnit bloodUnit5 = bloodUnitService.getBloodUnitById(5).orElse(null);
                if (bloodUnit5 != null) {
                        LocalDateTime analysisDate5 = LocalDateTime.of(2024, 6, 6, 9, 30);
                        AnalysisResult analysisResult5 = AnalysisResult.builder()
                                        .units(bloodUnit5)
                                        .analysis_type("Blood Pressure Test")
                                        .result("Normal")
                                        .analysis_date(Date
                                                        .from(analysisDate5.atZone(ZoneId.systemDefault()).toInstant()))
                                        .observations("No observations")
                                        .build();
                        analysisResultService.saveAnalysisResult(analysisResult5);
                }

                // Resultado de análisis 6
                BloodUnit bloodUnit6 = bloodUnitService.getBloodUnitById(6).orElse(null);
                if (bloodUnit6 != null) {
                        LocalDateTime analysisDate6 = LocalDateTime.of(2024, 2, 7, 14, 0);
                        AnalysisResult analysisResult6 = AnalysisResult.builder()
                                        .units(bloodUnit6)
                                        .analysis_type("Hemoglobin Test")
                                        .result("High")
                                        .analysis_date(Date
                                                        .from(analysisDate6.atZone(ZoneId.systemDefault()).toInstant()))
                                        .observations("No observations")
                                        .build();
                        analysisResultService.saveAnalysisResult(analysisResult6);
                }

                // Resultado de análisis 7
                BloodUnit bloodUnit7 = bloodUnitService.getBloodUnitById(7).orElse(null);
                if (bloodUnit7 != null) {
                        LocalDateTime analysisDate7 = LocalDateTime.of(2024, 4, 8, 11, 45);
                        AnalysisResult analysisResult7 = AnalysisResult.builder()
                                        .units(bloodUnit7)
                                        .analysis_type("Vitamin D Test")
                                        .result("Low")
                                        .analysis_date(Date
                                                        .from(analysisDate7.atZone(ZoneId.systemDefault()).toInstant()))
                                        .observations("Low vitamin D levels")
                                        .build();
                        analysisResultService.saveAnalysisResult(analysisResult7);
                }

                // Resultado de análisis 8
                BloodUnit bloodUnit8 = bloodUnitService.getBloodUnitById(8).orElse(null);
                if (bloodUnit8 != null) {
                        LocalDateTime analysisDate8 = LocalDateTime.of(2024, 3, 9, 16, 20);
                        AnalysisResult analysisResult8 = AnalysisResult.builder()
                                        .units(bloodUnit8)
                                        .analysis_type("Thyroid Test")
                                        .result("Normal")
                                        .analysis_date(Date
                                                        .from(analysisDate8.atZone(ZoneId.systemDefault()).toInstant()))
                                        .observations("No observations")
                                        .build();
                        analysisResultService.saveAnalysisResult(analysisResult8);
                }

                // Resultado de análisis 9
                BloodUnit bloodUnit9 = bloodUnitService.getBloodUnitById(9).orElse(null);
                if (bloodUnit9 != null) {
                        LocalDateTime analysisDate9 = LocalDateTime.of(2024, 1, 10, 7, 55);
                        AnalysisResult analysisResult9 = AnalysisResult.builder()
                                        .units(bloodUnit9)
                                        .analysis_type("Vitamin D Levels")
                                        .result("Normal")
                                        .analysis_date(Date
                                                        .from(analysisDate9.atZone(ZoneId.systemDefault()).toInstant()))
                                        .observations("Adequate vitamin D levels")
                                        .build();
                        analysisResultService.saveAnalysisResult(analysisResult9);
                }

                // Resultado de análisis 10
                BloodUnit bloodUnit10 = bloodUnitService.getBloodUnitById(10).orElse(null);
                if (bloodUnit10 != null) {
                        LocalDateTime analysisDate10 = LocalDateTime.of(2024, 9, 11, 13, 10);
                        AnalysisResult analysisResult10 = AnalysisResult.builder()
                                        .units(bloodUnit10)
                                        .analysis_type("Potassium Levels")
                                        .result("Low")
                                        .analysis_date(Date.from(
                                                        analysisDate10.atZone(ZoneId.systemDefault()).toInstant()))
                                        .observations("Optimal potassium levels")
                                        .build();
                        analysisResultService.saveAnalysisResult(analysisResult10);
                }

                // Resultado de análisis 11
                BloodUnit bloodUnit11 = bloodUnitService.getBloodUnitById(11).orElse(null);
                if (bloodUnit11 != null) {
                        LocalDateTime analysisDate11 = LocalDateTime.of(2024, 5, 12, 10, 30);
                        AnalysisResult analysisResult11 = AnalysisResult.builder()
                                        .units(bloodUnit11)
                                        .analysis_type("Magnesium Levels")
                                        .result("Normal")
                                        .analysis_date(Date.from(
                                                        analysisDate11.atZone(ZoneId.systemDefault()).toInstant()))
                                        .observations("Healthy magnesium levels")
                                        .build();
                        analysisResultService.saveAnalysisResult(analysisResult11);
                }

                // Resultado de análisis 12
                BloodUnit bloodUnit12 = bloodUnitService.getBloodUnitById(12).orElse(null);
                if (bloodUnit12 != null) {
                        LocalDateTime analysisDate12 = LocalDateTime.of(2024, 7, 13, 14, 15);
                        AnalysisResult analysisResult12 = AnalysisResult.builder()
                                        .units(bloodUnit12)
                                        .analysis_type("Calcium Levels")
                                        .result("Normal")
                                        .analysis_date(Date.from(
                                                        analysisDate12.atZone(ZoneId.systemDefault()).toInstant()))
                                        .observations("Optimal calcium levels")
                                        .build();
                        analysisResultService.saveAnalysisResult(analysisResult12);
                }

                // Resultado de análisis 13
                BloodUnit bloodUnit13 = bloodUnitService.getBloodUnitById(13).orElse(null);
                if (bloodUnit13 != null) {
                        LocalDateTime analysisDate13 = LocalDateTime.of(2024, 3, 14, 9, 0);
                        AnalysisResult analysisResult13 = AnalysisResult.builder()
                                        .units(bloodUnit13)
                                        .analysis_type("Cholesterol Levels")
                                        .result("Normal")
                                        .analysis_date(Date.from(
                                                        analysisDate13.atZone(ZoneId.systemDefault()).toInstant()))
                                        .observations("Healthy cholesterol levels")
                                        .build();
                        analysisResultService.saveAnalysisResult(analysisResult13);
                }

                // Resultado de análisis 14
                BloodUnit bloodUnit14 = bloodUnitService.getBloodUnitById(14).orElse(null);
                if (bloodUnit14 != null) {
                        LocalDateTime analysisDate14 = LocalDateTime.of(2024, 4, 15, 11, 45);
                        AnalysisResult analysisResult14 = AnalysisResult.builder()
                                        .units(bloodUnit14)
                                        .analysis_type("Iron Levels")
                                        .result("High")
                                        .analysis_date(Date.from(
                                                        analysisDate14.atZone(ZoneId.systemDefault()).toInstant()))
                                        .observations("Adequate iron levels")
                                        .build();
                        analysisResultService.saveAnalysisResult(analysisResult14);
                }

                // Resultado de análisis 15
                BloodUnit bloodUnit15 = bloodUnitService.getBloodUnitById(15).orElse(null);
                if (bloodUnit15 != null) {
                        LocalDateTime analysisDate15 = LocalDateTime.of(2024, 12, 16, 16, 20);
                        AnalysisResult analysisResult15 = AnalysisResult.builder()
                                        .units(bloodUnit15)
                                        .analysis_type("Thyroid Function")
                                        .result("Normal")
                                        .analysis_date(Date.from(
                                                        analysisDate15.atZone(ZoneId.systemDefault()).toInstant()))
                                        .observations("Healthy thyroid function")
                                        .build();
                        analysisResultService.saveAnalysisResult(analysisResult15);
                }

                // Resultado de análisis 16
                BloodUnit bloodUnit16 = bloodUnitService.getBloodUnitById(16).orElse(null);
                if (bloodUnit16 != null) {
                        LocalDateTime analysisDate16 = LocalDateTime.of(2024, 11, 17, 8, 45);
                        AnalysisResult analysisResult16 = AnalysisResult.builder()
                                        .units(bloodUnit16)
                                        .analysis_type("Hemoglobin Levels")
                                        .result("Normal")
                                        .analysis_date(Date.from(
                                                        analysisDate16.atZone(ZoneId.systemDefault()).toInstant()))
                                        .observations("Optimal hemoglobin levels")
                                        .build();
                        analysisResultService.saveAnalysisResult(analysisResult16);
                }

                // Resultado de análisis 17
                BloodUnit bloodUnit17 = bloodUnitService.getBloodUnitById(17).orElse(null);
                if (bloodUnit17 != null) {
                        LocalDateTime analysisDate17 = LocalDateTime.of(2024, 5, 18, 13, 10);
                        AnalysisResult analysisResult17 = AnalysisResult.builder()
                                        .units(bloodUnit17)
                                        .analysis_type("C-reactive Protein")
                                        .result("Low")
                                        .analysis_date(Date.from(
                                                        analysisDate17.atZone(ZoneId.systemDefault()).toInstant()))
                                        .observations("Healthy C-reactive protein levels")
                                        .build();
                        analysisResultService.saveAnalysisResult(analysisResult17);
                }

                // Resultado de análisis 18
                BloodUnit bloodUnit18 = bloodUnitService.getBloodUnitById(18).orElse(null);
                if (bloodUnit18 != null) {
                        LocalDateTime analysisDate18 = LocalDateTime.of(2024, 1, 19, 12, 0);
                        AnalysisResult analysisResult18 = AnalysisResult.builder()
                                        .units(bloodUnit18)
                                        .analysis_type("Prostate-specific Antigen (PSA)")
                                        .result("Normal")
                                        .analysis_date(Date.from(
                                                        analysisDate18.atZone(ZoneId.systemDefault()).toInstant()))
                                        .observations("Healthy PSA levels")
                                        .build();
                        analysisResultService.saveAnalysisResult(analysisResult18);
                }

                // Resultado de análisis 19
                BloodUnit bloodUnit19 = bloodUnitService.getBloodUnitById(19).orElse(null);
                if (bloodUnit19 != null) {
                        LocalDateTime analysisDate19 = LocalDateTime.of(2024, 10, 20, 9, 30);
                        AnalysisResult analysisResult19 = AnalysisResult.builder()
                                        .units(bloodUnit19)
                                        .analysis_type("Blood Sugar Levels")
                                        .result("Normal")
                                        .analysis_date(Date.from(
                                                        analysisDate19.atZone(ZoneId.systemDefault()).toInstant()))
                                        .observations("Healthy blood sugar levels")
                                        .build();
                        analysisResultService.saveAnalysisResult(analysisResult19);
                }

                // Resultado de análisis 20
                BloodUnit bloodUnit20 = bloodUnitService.getBloodUnitById(20).orElse(null);
                if (bloodUnit20 != null) {
                        LocalDateTime analysisDate20 = LocalDateTime.of(2024, 9, 21, 15, 0);
                        AnalysisResult analysisResult20 = AnalysisResult.builder()
                                        .units(bloodUnit20)
                                        .analysis_type("HDL Cholesterol")
                                        .result("High")
                                        .analysis_date(Date.from(
                                                        analysisDate20.atZone(ZoneId.systemDefault()).toInstant()))
                                        .observations("Optimal HDL cholesterol levels")
                                        .build();
                        analysisResultService.saveAnalysisResult(analysisResult20);
                }
        }

        private void generateDonationEvents() throws ParseException {

                DonationEvent donationEvent = DonationEvent.builder()
                                .event_date(new SimpleDateFormat("yyyy-MM-dd").parse("2022-02-15"))
                                .city("Bogotá")
                                .address("Carrera 7 # 32-37")
                                .description("Annual Blood Donation Drive - Join us for the annual blood donation drive in Bogotá. Your donation can help save lives and support healthcare services in our community.")
                                .status_event("Scheduled")
                                .build();
                donationEventService.saveDonationEvent(donationEvent);

                // Evento de donación 1
                DonationEvent donationEvent1 = DonationEvent.builder()
                                .event_date(new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-15"))
                                .city("Medellín")
                                .address("Calle 44 # 70-70")
                                .description("Blood Donation Campaign - Be a part of the blood donation campaign in Medellín. Your contribution can make a difference in someone's life.")
                                .status_event("Scheduled")
                                .build();
                donationEventService.saveDonationEvent(donationEvent1);

                // Evento de donación 2
                DonationEvent donationEvent2 = DonationEvent.builder()
                                .event_date(new SimpleDateFormat("yyyy-MM-dd").parse("2022-12-10"))
                                .city("Cali")
                                .address("Avenida 5 # 23-58")
                                .description("Community Blood Drive - Cali hosts a community blood drive. Donate blood and be a hero in someone's life.")
                                .status_event("Completed")
                                .build();
                donationEventService.saveDonationEvent(donationEvent2);

                // Evento de donación 3
                DonationEvent donationEvent3 = DonationEvent.builder()
                                .event_date(new SimpleDateFormat("yyyy-MM-dd").parse("2022-04-05"))
                                .city("Barranquilla")
                                .address("Carrera 43 # 84-50")
                                .description("Canceled Blood Donation Event - The blood donation event in Barranquilla has been canceled. Stay tuned for future opportunities.")
                                .status_event("Canceled")
                                .build();
                donationEventService.saveDonationEvent(donationEvent3);

                // Evento de donación 4
                DonationEvent donationEvent4 = DonationEvent.builder()
                                .event_date(new SimpleDateFormat("yyyy-MM-dd").parse("2022-05-20"))
                                .city("Cartagena")
                                .address("Avenida Pedro de Heredia # 30-25")
                                .description("Blood Donation Marathon - Join us for a blood donation marathon in Cartagena. Your donation can help save many lives.")
                                .status_event("Scheduled")
                                .build();
                donationEventService.saveDonationEvent(donationEvent4);

                // Evento de donación 5
                DonationEvent donationEvent5 = DonationEvent.builder()
                                .event_date(new SimpleDateFormat("yyyy-MM-dd").parse("2022-06-15"))
                                .city("Bucaramanga")
                                .address("Carrera 27 # 34-45")
                                .description("Corporate Blood Drive - Bucaramanga hosts a corporate blood drive. Come forward and donate blood for a noble cause.")
                                .status_event("Completed")
                                .build();
                donationEventService.saveDonationEvent(donationEvent5);

                // Evento de donación 6
                DonationEvent donationEvent6 = DonationEvent.builder()
                                .event_date(new SimpleDateFormat("yyyy-MM-dd").parse("2021-07-10"))
                                .city("Pereira")
                                .address("Calle 15 # 20-30")
                                .description("Canceled Blood Donation Event - Unfortunately, the blood donation event in Pereira has been canceled. Stay tuned for future opportunities.")
                                .status_event("Canceled")
                                .build();
                donationEventService.saveDonationEvent(donationEvent6);

                // Evento de donación 7
                DonationEvent donationEvent7 = DonationEvent.builder()
                                .event_date(new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-25"))
                                .city("Santa Marta")
                                .address("Carrera 3 # 14-56")
                                .description("Blood Donation Day - Santa Marta invites you to a blood donation day. Your donation can help save lives in our community.")
                                .status_event("Scheduled")
                                .build();
                donationEventService.saveDonationEvent(donationEvent7);

                // Evento de donación 8
                DonationEvent donationEvent8 = DonationEvent.builder()
                                .event_date(new SimpleDateFormat("yyyy-MM-dd").parse("2022-09-20"))
                                .city("Ibagué")
                                .address("Carrera 4 # 12-34")
                                .description("Completed Blood Donation Event - Ibagué hosted a successful blood donation event. Thanks to all the donors who participated!")
                                .status_event("Completed")
                                .build();
                donationEventService.saveDonationEvent(donationEvent8);

                // Evento de donación 9
                DonationEvent donationEvent9 = DonationEvent.builder()
                                .event_date(new SimpleDateFormat("yyyy-MM-dd").parse("2022-10-15"))
                                .city("Manizales")
                                .address("Calle 20 # 25-67")
                                .description("Canceled Blood Donation Event - Unfortunately, the blood donation event in Manizales has been canceled. Stay tuned for future opportunities.")
                                .status_event("Canceled")
                                .build();
                donationEventService.saveDonationEvent(donationEvent9);

                // Evento de donación 10
                DonationEvent donationEvent10 = DonationEvent.builder()
                                .event_date(new SimpleDateFormat("yyyy-MM-dd").parse("2022-11-30"))
                                .city("Cúcuta")
                                .address("Carrera 9 # 15-23")
                                .description("Blood Donation Marathon - Join us for a blood donation marathon in Cúcuta. Your donation can help save many lives.")
                                .status_event("Scheduled")
                                .build();
                donationEventService.saveDonationEvent(donationEvent10);

                // Evento de donación 11
                DonationEvent donationEvent11 = DonationEvent.builder()
                                .event_date(new SimpleDateFormat("yyyy-MM-dd").parse("2022-03-11"))
                                .city("Pasto")
                                .address("Avenida Boyacá # 10-15")
                                .description("Spring Blood Drive - Join us for a spring blood drive in Pasto. Your donation can help replenish blood supplies for medical emergencies.")
                                .status_event("Scheduled")
                                .build();
                donationEventService.saveDonationEvent(donationEvent11);

                // Evento de donación 12
                DonationEvent donationEvent12 = DonationEvent.builder()
                                .event_date(new SimpleDateFormat("yyyy-MM-dd").parse("2022-03-20"))
                                .city("Villavicencio")
                                .address("Carrera 15 # 20-25")
                                .description("Community Blood Donation - Villavicencio hosts a community blood donation event. Donate blood and save lives!")
                                .status_event("In Progress")
                                .build();
                donationEventService.saveDonationEvent(donationEvent12);

                // Evento de donación 13
                DonationEvent donationEvent13 = DonationEvent.builder()
                                .event_date(new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-05"))
                                .city("Cúcuta")
                                .address("Calle 12 # 18-30")
                                .description("Emergency Blood Drive - Cúcuta hosts an emergency blood drive. Your immediate donation can make a significant impact.")
                                .status_event("Completed")
                                .build();
                donationEventService.saveDonationEvent(donationEvent13);

                // Evento de donación 14
                DonationEvent donationEvent14 = DonationEvent.builder()
                                .event_date(new SimpleDateFormat("yyyy-MM-dd").parse("2022-04-15"))
                                .city("Ibagué")
                                .address("Calle 25 # 30-45")
                                .description("School Blood Donation - Ibagué hosts a school blood donation event. Students and faculty are encouraged to participate.")
                                .status_event("Scheduled")
                                .build();
                donationEventService.saveDonationEvent(donationEvent14);

                // Evento de donación 15
                DonationEvent donationEvent15 = DonationEvent.builder()
                                .event_date(new SimpleDateFormat("yyyy-MM-dd").parse("2022-05-01"))
                                .city("Barranquilla")
                                .address("Carrera 20 # 15-10")
                                .description("Corporate Blood Drive - Barranquilla hosts a corporate blood drive. Be a part of this initiative to support the local healthcare system.")
                                .status_event("In Progress")
                                .build();
                donationEventService.saveDonationEvent(donationEvent15);

                // Evento de donación 16
                DonationEvent donationEvent16 = DonationEvent.builder()
                                .event_date(new SimpleDateFormat("yyyy-MM-dd").parse("2022-05-10"))
                                .city("Medellín")
                                .address("Carrera 35 # 40-55")
                                .description("Hospital Blood Donation - Medellín hosts a hospital blood donation event. Your donation can directly impact patients in need.")
                                .status_event("Completed")
                                .build();
                donationEventService.saveDonationEvent(donationEvent16);

                // Evento de donación 17
                DonationEvent donationEvent17 = DonationEvent.builder()
                                .event_date(new SimpleDateFormat("yyyy-MM-dd").parse("2022-06-05"))
                                .city("Cali")
                                .address("Avenida 10 # 18-20")
                                .description("Community Health Fair - Cali hosts a community health fair with a focus on blood donation. Join us for a day of health awareness.")
                                .status_event("Scheduled")
                                .build();
                donationEventService.saveDonationEvent(donationEvent17);

                // Evento de donación 18
                DonationEvent donationEvent18 = DonationEvent.builder()
                                .event_date(new SimpleDateFormat("yyyy-MM-dd").parse("2022-06-11"))
                                .city("Cartagena")
                                .address("Calle Real # 15-25")
                                .description("Summer Blood Drive - Join us for a summer blood drive in Cartagena. Your donation can help maintain blood supplies during the summer months.")
                                .status_event("In Progress")
                                .build();
                donationEventService.saveDonationEvent(donationEvent18);

                // Evento de donación 19
                DonationEvent donationEvent19 = DonationEvent.builder()
                                .event_date(new SimpleDateFormat("yyyy-MM-dd").parse("2022-07-01"))
                                .city("Bucaramanga")
                                .address("Carrera 12 # 25-30")
                                .description("School Blood Donation - Bucaramanga hosts a school blood donation event. Students, faculty, and parents are encouraged to participate.")
                                .status_event("Completed")
                                .build();
                donationEventService.saveDonationEvent(donationEvent19);

                // Evento de donación 20
                DonationEvent donationEvent20 = DonationEvent.builder()
                                .event_date(new SimpleDateFormat("yyyy-MM-dd").parse("2022-07-10"))
                                .city("Pereira")
                                .address("Avenida Circunvalar # 22-18")
                                .description("Corporate Blood Drive - Pereira hosts a corporate blood drive. Be a hero by donating blood and supporting your community.")
                                .status_event("Scheduled")
                                .build();
                donationEventService.saveDonationEvent(donationEvent20);

        }

        private void generateDonationRecordEvents() {

                Person donor = personService.getPersonById(1).orElse(null);
                DonationEvent event = donationEventService.getDonationEventById(1).orElse(null);
                BloodUnit unit = bloodUnitService.getBloodUnitById(1).orElse(null);

                if (donor != null && event != null && unit != null) {
                        DonationRecordEvent donationRecordEvent = DonationRecordEvent.builder()
                                        .donorEvent(donor)
                                        .events(event)
                                        .unitsEvent(unit)
                                        .build();

                        donationRecordEventService.saveDonationRecordEvent(donationRecordEvent);
                }

                // 1
                Person donor1 = personService.getPersonById(2).orElse(null);
                DonationEvent event1 = donationEventService.getDonationEventById(2).orElse(null);
                BloodUnit unit1 = bloodUnitService.getBloodUnitById(2).orElse(null);

                if (donor1 != null && event1 != null && unit1 != null) {
                        DonationRecordEvent donationRecordEvent1 = DonationRecordEvent.builder()
                                        .donorEvent(donor1)
                                        .events(event1)
                                        .unitsEvent(unit1)
                                        .build();
                        donationRecordEventService.saveDonationRecordEvent(donationRecordEvent1);
                }

                // 2
                Person donor2 = personService.getPersonById(5).orElse(null);
                DonationEvent event2 = donationEventService.getDonationEventById(3).orElse(null);
                BloodUnit unit2 = bloodUnitService.getBloodUnitById(3).orElse(null);

                if (donor2 != null && event2 != null && unit2 != null) {
                        DonationRecordEvent donationRecordEvent2 = DonationRecordEvent.builder()
                                        .donorEvent(donor2)
                                        .events(event2)
                                        .unitsEvent(unit2)
                                        .build();
                        donationRecordEventService.saveDonationRecordEvent(donationRecordEvent2);
                }

                // 3
                Person donor3 = personService.getPersonById(8).orElse(null);
                DonationEvent event3 = donationEventService.getDonationEventById(4).orElse(null);
                BloodUnit unit3 = bloodUnitService.getBloodUnitById(4).orElse(null);

                if (donor3 != null && event3 != null && unit3 != null) {
                        DonationRecordEvent donationRecordEvent3 = DonationRecordEvent.builder()
                                        .donorEvent(donor3)
                                        .events(event3)
                                        .unitsEvent(unit3)
                                        .build();
                        donationRecordEventService.saveDonationRecordEvent(donationRecordEvent3);
                }

                // 4
                Person donor4 = personService.getPersonById(11).orElse(null);
                DonationEvent event4 = donationEventService.getDonationEventById(5).orElse(null);
                BloodUnit unit4 = bloodUnitService.getBloodUnitById(5).orElse(null);

                if (donor4 != null && event4 != null && unit4 != null) {
                        DonationRecordEvent donationRecordEvent4 = DonationRecordEvent.builder()
                                        .donorEvent(donor4)
                                        .events(event4)
                                        .unitsEvent(unit4)
                                        .build();
                        donationRecordEventService.saveDonationRecordEvent(donationRecordEvent4);
                }

                // 5
                Person donor5 = personService.getPersonById(14).orElse(null);
                DonationEvent event5 = donationEventService.getDonationEventById(6).orElse(null);
                BloodUnit unit5 = bloodUnitService.getBloodUnitById(6).orElse(null);

                if (donor5 != null && event5 != null && unit5 != null) {
                        DonationRecordEvent donationRecordEvent5 = DonationRecordEvent.builder()
                                        .donorEvent(donor5)
                                        .events(event5)
                                        .unitsEvent(unit5)
                                        .build();
                        donationRecordEventService.saveDonationRecordEvent(donationRecordEvent5);
                }

                // 6
                Person donor6 = personService.getPersonById(15).orElse(null);
                DonationEvent event6 = donationEventService.getDonationEventById(7).orElse(null);
                BloodUnit unit6 = bloodUnitService.getBloodUnitById(7).orElse(null);

                if (donor6 != null && event6 != null && unit6 != null) {
                        DonationRecordEvent donationRecordEvent6 = DonationRecordEvent.builder()
                                        .donorEvent(donor6)
                                        .events(event6)
                                        .unitsEvent(unit6)
                                        .build();
                        donationRecordEventService.saveDonationRecordEvent(donationRecordEvent6);
                }

                // 7
                Person donor7 = personService.getPersonById(17).orElse(null);
                DonationEvent event7 = donationEventService.getDonationEventById(8).orElse(null);
                BloodUnit unit7 = bloodUnitService.getBloodUnitById(8).orElse(null);

                if (donor7 != null && event7 != null && unit7 != null) {
                        DonationRecordEvent donationRecordEvent7 = DonationRecordEvent.builder()
                                        .donorEvent(donor7)
                                        .events(event7)
                                        .unitsEvent(unit7)
                                        .build();
                        donationRecordEventService.saveDonationRecordEvent(donationRecordEvent7);
                }

                // 8
                Person donor8 = personService.getPersonById(19).orElse(null);
                DonationEvent event8 = donationEventService.getDonationEventById(9).orElse(null);
                BloodUnit unit8 = bloodUnitService.getBloodUnitById(9).orElse(null);

                if (donor8 != null && event8 != null && unit8 != null) {
                        DonationRecordEvent donationRecordEvent8 = DonationRecordEvent.builder()
                                        .donorEvent(donor8)
                                        .events(event8)
                                        .unitsEvent(unit8)
                                        .build();
                        donationRecordEventService.saveDonationRecordEvent(donationRecordEvent8);
                }

                // 9
                Person donor9 = personService.getPersonById(19).orElse(null);
                DonationEvent event9 = donationEventService.getDonationEventById(10).orElse(null);
                BloodUnit unit9 = bloodUnitService.getBloodUnitById(10).orElse(null);

                if (donor9 != null && event9 != null && unit9 != null) {
                        DonationRecordEvent donationRecordEvent9 = DonationRecordEvent.builder()
                                        .donorEvent(donor9)
                                        .events(event9)
                                        .unitsEvent(unit9)
                                        .build();
                        donationRecordEventService.saveDonationRecordEvent(donationRecordEvent9);
                }

                // 10
                Person donor10 = personService.getPersonById(19).orElse(null);
                DonationEvent event10 = donationEventService.getDonationEventById(11).orElse(null);
                BloodUnit unit10 = bloodUnitService.getBloodUnitById(10).orElse(null);

                if (donor10 != null && event10 != null && unit10 != null) {
                        DonationRecordEvent donationRecordEvent10 = DonationRecordEvent.builder()
                                        .donorEvent(donor10)
                                        .events(event10)
                                        .unitsEvent(unit10)
                                        .build();
                        donationRecordEventService.saveDonationRecordEvent(donationRecordEvent10);
                }

                // 11
                Person donor11 = personService.getPersonById(17).orElse(null);
                DonationEvent event11 = donationEventService.getDonationEventById(12).orElse(null);
                BloodUnit unit11 = bloodUnitService.getBloodUnitById(9).orElse(null);

                if (donor11 != null && event11 != null && unit11 != null) {
                        DonationRecordEvent donationRecordEvent11 = DonationRecordEvent.builder()
                                        .donorEvent(donor11)
                                        .events(event11)
                                        .unitsEvent(unit11)
                                        .build();
                        donationRecordEventService.saveDonationRecordEvent(donationRecordEvent11);
                }

                // 12
                Person donor12 = personService.getPersonById(15).orElse(null);
                DonationEvent event12 = donationEventService.getDonationEventById(13).orElse(null);
                BloodUnit unit12 = bloodUnitService.getBloodUnitById(8).orElse(null);

                if (donor12 != null && event12 != null && unit12 != null) {
                        DonationRecordEvent donationRecordEvent12 = DonationRecordEvent.builder()
                                        .donorEvent(donor12)
                                        .events(event12)
                                        .unitsEvent(unit12)
                                        .build();
                        donationRecordEventService.saveDonationRecordEvent(donationRecordEvent12);
                }

                // 13
                Person donor13 = personService.getPersonById(14).orElse(null);
                DonationEvent event13 = donationEventService.getDonationEventById(14).orElse(null);
                BloodUnit unit13 = bloodUnitService.getBloodUnitById(7).orElse(null);

                if (donor13 != null && event13 != null && unit13 != null) {
                        DonationRecordEvent donationRecordEvent13 = DonationRecordEvent.builder()
                                        .donorEvent(donor13)
                                        .events(event13)
                                        .unitsEvent(unit13)
                                        .build();
                        donationRecordEventService.saveDonationRecordEvent(donationRecordEvent13);
                }

                // 14
                Person donor14 = personService.getPersonById(11).orElse(null);
                DonationEvent event14 = donationEventService.getDonationEventById(15).orElse(null);
                BloodUnit unit14 = bloodUnitService.getBloodUnitById(6).orElse(null);

                if (donor14 != null && event14 != null && unit14 != null) {
                        DonationRecordEvent donationRecordEvent14 = DonationRecordEvent.builder()
                                        .donorEvent(donor14)
                                        .events(event14)
                                        .unitsEvent(unit14)
                                        .build();
                        donationRecordEventService.saveDonationRecordEvent(donationRecordEvent14);
                }

                // 15
                Person donor15 = personService.getPersonById(8).orElse(null);
                DonationEvent event15 = donationEventService.getDonationEventById(16).orElse(null);
                BloodUnit unit15 = bloodUnitService.getBloodUnitById(5).orElse(null);

                if (donor15 != null && event15 != null && unit15 != null) {
                        DonationRecordEvent donationRecordEvent15 = DonationRecordEvent.builder()
                                        .donorEvent(donor15)
                                        .events(event15)
                                        .unitsEvent(unit15)
                                        .build();
                        donationRecordEventService.saveDonationRecordEvent(donationRecordEvent15);
                }

                // 16
                Person donor16 = personService.getPersonById(5).orElse(null);
                DonationEvent event16 = donationEventService.getDonationEventById(17).orElse(null);
                BloodUnit unit16 = bloodUnitService.getBloodUnitById(4).orElse(null);

                if (donor16 != null && event16 != null && unit16 != null) {
                        DonationRecordEvent donationRecordEvent16 = DonationRecordEvent.builder()
                                        .donorEvent(donor16)
                                        .events(event16)
                                        .unitsEvent(unit16)
                                        .build();
                        donationRecordEventService.saveDonationRecordEvent(donationRecordEvent16);
                }

                // 17
                Person donor17 = personService.getPersonById(2).orElse(null);
                DonationEvent event17 = donationEventService.getDonationEventById(18).orElse(null);
                BloodUnit unit17 = bloodUnitService.getBloodUnitById(3).orElse(null);

                if (donor17 != null && event17 != null && unit17 != null) {
                        DonationRecordEvent donationRecordEvent17 = DonationRecordEvent.builder()
                                        .donorEvent(donor17)
                                        .events(event17)
                                        .unitsEvent(unit17)
                                        .build();
                        donationRecordEventService.saveDonationRecordEvent(donationRecordEvent17);
                }

                // 18
                Person donor18 = personService.getPersonById(1).orElse(null);
                DonationEvent event18 = donationEventService.getDonationEventById(19).orElse(null);
                BloodUnit unit18 = bloodUnitService.getBloodUnitById(2).orElse(null);

                if (donor18 != null && event18 != null && unit18 != null) {
                        DonationRecordEvent donationRecordEvent18 = DonationRecordEvent.builder()
                                        .donorEvent(donor18)
                                        .events(event18)
                                        .unitsEvent(unit18)
                                        .build();
                        donationRecordEventService.saveDonationRecordEvent(donationRecordEvent18);
                }

                // 19
                Person donor19 = personService.getPersonById(1).orElse(null);
                DonationEvent event19 = donationEventService.getDonationEventById(20).orElse(null);
                BloodUnit unit19 = bloodUnitService.getBloodUnitById(1).orElse(null);

                if (donor19 != null && event19 != null && unit19 != null) {
                        DonationRecordEvent donationRecordEvent19 = DonationRecordEvent.builder()
                                        .donorEvent(donor19)
                                        .events(event19)
                                        .unitsEvent(unit19)
                                        .build();
                        donationRecordEventService.saveDonationRecordEvent(donationRecordEvent19);
                }

                // 20
                Person donor20 = personService.getPersonById(19).orElse(null);
                DonationEvent event20 = donationEventService.getDonationEventById(21).orElse(null);
                BloodUnit unit20 = bloodUnitService.getBloodUnitById(10).orElse(null);

                if (donor20 != null && event20 != null && unit20 != null) {
                        DonationRecordEvent donationRecordEvent20 = DonationRecordEvent.builder()
                                        .donorEvent(donor20)
                                        .events(event20)
                                        .unitsEvent(unit20)
                                        .build();
                        donationRecordEventService.saveDonationRecordEvent(donationRecordEvent20);
                }

        }

        private void generateEventResponsiblePersons() {

                Person staff = personService.getPersonById(6).orElse(null);
                DonationEvent event = donationEventService.getDonationEventById(1).orElse(null);

                if (staff != null && event != null) {
                        EventResponsiblePerson eventResponsiblePerson = EventResponsiblePerson.builder()
                                        .staffEvent(staff)
                                        .eventsResponsible(event)
                                        .build();

                        eventResponsiblePersonService.saveEventResponsiblePerson(eventResponsiblePerson);
                }

                // 1
                Person staff1 = personService.getPersonById(18).orElse(null);
                DonationEvent event1 = donationEventService.getDonationEventById(1).orElse(null);

                if (staff1 != null && event1 != null) {
                        EventResponsiblePerson eventResponsiblePerson1 = EventResponsiblePerson.builder()
                                        .staffEvent(staff1)
                                        .eventsResponsible(event1)
                                        .build();

                        eventResponsiblePersonService.saveEventResponsiblePerson(eventResponsiblePerson1);
                }

                // 2
                Person staff2 = personService.getPersonById(6).orElse(null);
                DonationEvent event2 = donationEventService.getDonationEventById(2).orElse(null);

                if (staff2 != null && event2 != null) {
                        EventResponsiblePerson eventResponsiblePerson2 = EventResponsiblePerson.builder()
                                        .staffEvent(staff2)
                                        .eventsResponsible(event2)
                                        .build();

                        eventResponsiblePersonService.saveEventResponsiblePerson(eventResponsiblePerson2);
                }

                // 3
                Person staff3 = personService.getPersonById(18).orElse(null);
                DonationEvent event3 = donationEventService.getDonationEventById(3).orElse(null);

                if (staff3 != null && event3 != null) {
                        EventResponsiblePerson eventResponsiblePerson3 = EventResponsiblePerson.builder()
                                        .staffEvent(staff3)
                                        .eventsResponsible(event3)
                                        .build();

                        eventResponsiblePersonService.saveEventResponsiblePerson(eventResponsiblePerson3);
                }

                // 4
                Person staff4 = personService.getPersonById(6).orElse(null);
                DonationEvent event4 = donationEventService.getDonationEventById(4).orElse(null);

                if (staff4 != null && event4 != null) {
                        EventResponsiblePerson eventResponsiblePerson4 = EventResponsiblePerson.builder()
                                        .staffEvent(staff4)
                                        .eventsResponsible(event4)
                                        .build();

                        eventResponsiblePersonService.saveEventResponsiblePerson(eventResponsiblePerson4);
                }

                // 5
                Person staff5 = personService.getPersonById(18).orElse(null);
                DonationEvent event5 = donationEventService.getDonationEventById(5).orElse(null);

                if (staff5 != null && event5 != null) {
                        EventResponsiblePerson eventResponsiblePerson5 = EventResponsiblePerson.builder()
                                        .staffEvent(staff5)
                                        .eventsResponsible(event5)
                                        .build();

                        eventResponsiblePersonService.saveEventResponsiblePerson(eventResponsiblePerson5);
                }

                // 6
                Person staff6 = personService.getPersonById(6).orElse(null);
                DonationEvent event6 = donationEventService.getDonationEventById(6).orElse(null);

                if (staff6 != null && event6 != null) {
                        EventResponsiblePerson eventResponsiblePerson6 = EventResponsiblePerson.builder()
                                        .staffEvent(staff6)
                                        .eventsResponsible(event6)
                                        .build();

                        eventResponsiblePersonService.saveEventResponsiblePerson(eventResponsiblePerson6);
                }

                // 7
                Person staff7 = personService.getPersonById(18).orElse(null);
                DonationEvent event7 = donationEventService.getDonationEventById(7).orElse(null);

                if (staff7 != null && event7 != null) {
                        EventResponsiblePerson eventResponsiblePerson7 = EventResponsiblePerson.builder()
                                        .staffEvent(staff7)
                                        .eventsResponsible(event7)
                                        .build();

                        eventResponsiblePersonService.saveEventResponsiblePerson(eventResponsiblePerson7);
                }

                // 8
                Person staff8 = personService.getPersonById(18).orElse(null);
                DonationEvent event8 = donationEventService.getDonationEventById(8).orElse(null);

                if (staff8 != null && event8 != null) {
                        EventResponsiblePerson eventResponsiblePerson8 = EventResponsiblePerson.builder()
                                        .staffEvent(staff8)
                                        .eventsResponsible(event8)
                                        .build();

                        eventResponsiblePersonService.saveEventResponsiblePerson(eventResponsiblePerson8);
                }

                // 9
                Person staff9 = personService.getPersonById(6).orElse(null);
                DonationEvent event9 = donationEventService.getDonationEventById(9).orElse(null);

                if (staff9 != null && event9 != null) {
                        EventResponsiblePerson eventResponsiblePerson9 = EventResponsiblePerson.builder()
                                        .staffEvent(staff9)
                                        .eventsResponsible(event9)
                                        .build();

                        eventResponsiblePersonService.saveEventResponsiblePerson(eventResponsiblePerson9);
                }

                // 10
                Person staff10 = personService.getPersonById(6).orElse(null);
                DonationEvent event10 = donationEventService.getDonationEventById(10).orElse(null);

                if (staff10 != null && event10 != null) {
                        EventResponsiblePerson eventResponsiblePerson10 = EventResponsiblePerson.builder()
                                        .staffEvent(staff10)
                                        .eventsResponsible(event10)
                                        .build();

                        eventResponsiblePersonService.saveEventResponsiblePerson(eventResponsiblePerson10);
                }

                // 11
                Person staff11 = personService.getPersonById(18).orElse(null);
                DonationEvent event11 = donationEventService.getDonationEventById(11).orElse(null);

                if (staff11 != null && event11 != null) {
                        EventResponsiblePerson eventResponsiblePerson11 = EventResponsiblePerson.builder()
                                        .staffEvent(staff11)
                                        .eventsResponsible(event11)
                                        .build();
                        eventResponsiblePersonService.saveEventResponsiblePerson(eventResponsiblePerson11);
                }

                // 12
                Person staff12 = personService.getPersonById(6).orElse(null);
                DonationEvent event12 = donationEventService.getDonationEventById(12).orElse(null);

                if (staff12 != null && event12 != null) {
                        EventResponsiblePerson eventResponsiblePerson12 = EventResponsiblePerson.builder()
                                        .staffEvent(staff12)
                                        .eventsResponsible(event12)
                                        .build();
                        eventResponsiblePersonService.saveEventResponsiblePerson(eventResponsiblePerson12);
                }

                // 13
                Person staff13 = personService.getPersonById(18).orElse(null);
                DonationEvent event13 = donationEventService.getDonationEventById(13).orElse(null);

                if (staff13 != null && event13 != null) {
                        EventResponsiblePerson eventResponsiblePerson13 = EventResponsiblePerson.builder()
                                        .staffEvent(staff13)
                                        .eventsResponsible(event13)
                                        .build();
                        eventResponsiblePersonService.saveEventResponsiblePerson(eventResponsiblePerson13);
                }

                // 14
                Person staff14 = personService.getPersonById(6).orElse(null);
                DonationEvent event14 = donationEventService.getDonationEventById(14).orElse(null);

                if (staff14 != null && event14 != null) {
                        EventResponsiblePerson eventResponsiblePerson14 = EventResponsiblePerson.builder()
                                        .staffEvent(staff14)
                                        .eventsResponsible(event14)
                                        .build();
                        eventResponsiblePersonService.saveEventResponsiblePerson(eventResponsiblePerson14);
                }

                // 15
                Person staff15 = personService.getPersonById(18).orElse(null);
                DonationEvent event15 = donationEventService.getDonationEventById(15).orElse(null);

                if (staff15 != null && event15 != null) {
                        EventResponsiblePerson eventResponsiblePerson15 = EventResponsiblePerson.builder()
                                        .staffEvent(staff15)
                                        .eventsResponsible(event15)
                                        .build();
                        eventResponsiblePersonService.saveEventResponsiblePerson(eventResponsiblePerson15);
                }

                // 16
                Person staff16 = personService.getPersonById(6).orElse(null);
                DonationEvent event16 = donationEventService.getDonationEventById(16).orElse(null);

                if (staff16 != null && event16 != null) {
                        EventResponsiblePerson eventResponsiblePerson16 = EventResponsiblePerson.builder()
                                        .staffEvent(staff16)
                                        .eventsResponsible(event16)
                                        .build();
                        eventResponsiblePersonService.saveEventResponsiblePerson(eventResponsiblePerson16);
                }

                // 17
                Person staff17 = personService.getPersonById(18).orElse(null);
                DonationEvent event17 = donationEventService.getDonationEventById(17).orElse(null);

                if (staff17 != null && event17 != null) {
                        EventResponsiblePerson eventResponsiblePerson17 = EventResponsiblePerson.builder()
                                        .staffEvent(staff17)
                                        .eventsResponsible(event17)
                                        .build();
                        eventResponsiblePersonService.saveEventResponsiblePerson(eventResponsiblePerson17);
                }

                // 18
                Person staff18 = personService.getPersonById(18).orElse(null);
                DonationEvent event18 = donationEventService.getDonationEventById(18).orElse(null);

                if (staff18 != null && event18 != null) {
                        EventResponsiblePerson eventResponsiblePerson18 = EventResponsiblePerson.builder()
                                        .staffEvent(staff18)
                                        .eventsResponsible(event18)
                                        .build();
                        eventResponsiblePersonService.saveEventResponsiblePerson(eventResponsiblePerson18);
                }

                // 19
                Person staff19 = personService.getPersonById(6).orElse(null);
                DonationEvent event19 = donationEventService.getDonationEventById(19).orElse(null);

                if (staff19 != null && event19 != null) {
                        EventResponsiblePerson eventResponsiblePerson19 = EventResponsiblePerson.builder()
                                        .staffEvent(staff19)
                                        .eventsResponsible(event19)
                                        .build();
                        eventResponsiblePersonService.saveEventResponsiblePerson(eventResponsiblePerson19);
                }

                // 20
                Person staff20 = personService.getPersonById(6).orElse(null);
                DonationEvent event20 = donationEventService.getDonationEventById(20).orElse(null);

                if (staff20 != null && event20 != null) {
                        EventResponsiblePerson eventResponsiblePerson20 = EventResponsiblePerson.builder()
                                        .staffEvent(staff20)
                                        .eventsResponsible(event20)
                                        .build();
                        eventResponsiblePersonService.saveEventResponsiblePerson(eventResponsiblePerson20);
                }

        }

        private void generateTransfusions() throws ParseException {

                BloodUnit unit = bloodUnitService.getBloodUnitById(11).orElse(null);
                Person staff = personService.getPersonById(3).orElse(null);
                Person receptor = personService.getPersonById(4).orElse(null);
                SimpleDateFormat dates = new SimpleDateFormat("yyyy-MM-dd");
                Date maybe3 = dates.parse("2024-03-04");
                Date maybe4 = dates.parse("2024-03-02");

                Transfusion transfusion = Transfusion.builder()
                                .transfusionDate(maybe3)
                                .observations("The recipient seemed a bit nervous but showed relief post-transfusion.")
                                .unitsTransfusion(unit)
                                .staff(staff)
                                .receptor(receptor)
                                .build();

                transfusionService.saveTransfusion(transfusion);

                // 1
                BloodUnit unit1 = bloodUnitService.getBloodUnitById(12).orElse(null);
                Person staff1 = personService.getPersonById(9).orElse(null);
                Person receptor1 = personService.getPersonById(7).orElse(null);

                Transfusion transfusion1 = Transfusion.builder()
                                .transfusionDate(new Date())
                                .observations("The recipient experienced mild dizziness immediately after the transfusion.")
                                .unitsTransfusion(unit1)
                                .staff(staff1)
                                .receptor(receptor1)
                                .build();
                transfusionService.saveTransfusion(transfusion1);

                // 2
                BloodUnit unit2 = bloodUnitService.getBloodUnitById(13).orElse(null);
                Person staff2 = personService.getPersonById(12).orElse(null);
                Person receptor2 = personService.getPersonById(10).orElse(null);

                Transfusion transfusion2 = Transfusion.builder()
                                .transfusionDate(maybe4)
                                .observations("The staff ensured the recipient was comfortable throughout the process.")
                                .unitsTransfusion(unit2)
                                .staff(staff2)
                                .receptor(receptor2)
                                .build();
                transfusionService.saveTransfusion(transfusion2);

                // 3
                BloodUnit unit3 = bloodUnitService.getBloodUnitById(14).orElse(null);
                Person staff3 = personService.getPersonById(20).orElse(null);
                Person receptor3 = personService.getPersonById(13).orElse(null);

                Transfusion transfusion3 = Transfusion.builder()
                                .transfusionDate(maybe3)
                                .observations("The recipient's vitals stabilized post-transfusion, indicating a successful procedure.")
                                .unitsTransfusion(unit3)
                                .staff(staff3)
                                .receptor(receptor3)
                                .build();
                transfusionService.saveTransfusion(transfusion3);

                // 4
                BloodUnit unit4 = bloodUnitService.getBloodUnitById(15).orElse(null);
                Person staff4 = personService.getPersonById(3).orElse(null);
                Person receptor4 = personService.getPersonById(16).orElse(null);

                Transfusion transfusion4 = Transfusion.builder()
                                .transfusionDate(new Date())
                                .observations("The recipient expressed gratitude towards the medical team for their professionalism.")
                                .unitsTransfusion(unit4)
                                .staff(staff4)
                                .receptor(receptor4)
                                .build();
                transfusionService.saveTransfusion(transfusion4);

                // 5
                BloodUnit unit5 = bloodUnitService.getBloodUnitById(16).orElse(null);
                Person staff5 = personService.getPersonById(9).orElse(null);
                Person receptor5 = personService.getPersonById(21).orElse(null);

                Transfusion transfusion5 = Transfusion.builder()
                                .transfusionDate(maybe4)
                                .observations("The staff provided detailed instructions for post-transfusion care to the recipient.")
                                .unitsTransfusion(unit5)
                                .staff(staff5)
                                .receptor(receptor5)
                                .build();
                transfusionService.saveTransfusion(transfusion5);

                // 6
                BloodUnit unit6 = bloodUnitService.getBloodUnitById(17).orElse(null);
                Person staff6 = personService.getPersonById(12).orElse(null);
                Person receptor6 = personService.getPersonById(4).orElse(null);

                Transfusion transfusion6 = Transfusion.builder()
                                .transfusionDate(maybe3)
                                .observations("The recipient's family members were relieved to see the positive effects of the transfusion.")
                                .unitsTransfusion(unit6)
                                .staff(staff6)
                                .receptor(receptor6)
                                .build();
                transfusionService.saveTransfusion(transfusion6);

                // 7
                BloodUnit unit7 = bloodUnitService.getBloodUnitById(18).orElse(null);
                Person staff7 = personService.getPersonById(20).orElse(null);
                Person receptor7 = personService.getPersonById(7).orElse(null);

                Transfusion transfusion7 = Transfusion.builder()
                                .transfusionDate(new Date())
                                .observations("The recipient's color improved significantly post-transfusion, indicating better oxygenation.")
                                .unitsTransfusion(unit7)
                                .staff(staff7)
                                .receptor(receptor7)
                                .build();
                transfusionService.saveTransfusion(transfusion7);

                // 8
                BloodUnit unit8 = bloodUnitService.getBloodUnitById(19).orElse(null);
                Person staff8 = personService.getPersonById(3).orElse(null);
                Person receptor8 = personService.getPersonById(10).orElse(null);

                Transfusion transfusion8 = Transfusion.builder()
                                .transfusionDate(maybe4)
                                .observations("The recipient's blood pressure stabilized after receiving the transfusion.")
                                .unitsTransfusion(unit8)
                                .staff(staff8)
                                .receptor(receptor8)
                                .build();
                transfusionService.saveTransfusion(transfusion8);

                // 9
                BloodUnit unit9 = bloodUnitService.getBloodUnitById(20).orElse(null);
                Person staff9 = personService.getPersonById(9).orElse(null);
                Person receptor9 = personService.getPersonById(13).orElse(null);

                Transfusion transfusion9 = Transfusion.builder()
                                .transfusionDate(maybe3)
                                .observations("The recipient felt immediate relief from symptoms after the transfusion.")
                                .unitsTransfusion(unit9)
                                .staff(staff9)
                                .receptor(receptor9)
                                .build();
                transfusionService.saveTransfusion(transfusion9);

                // 10
                BloodUnit unit10 = bloodUnitService.getBloodUnitById(20).orElse(null);
                Person staff10 = personService.getPersonById(12).orElse(null);
                Person receptor10 = personService.getPersonById(16).orElse(null);

                Transfusion transfusion10 = Transfusion.builder()
                                .transfusionDate(new Date())
                                .observations("The medical team monitored the recipient closely during and after the transfusion.")
                                .unitsTransfusion(unit10)
                                .staff(staff10)
                                .receptor(receptor10)
                                .build();
                transfusionService.saveTransfusion(transfusion10);

                // 11
                BloodUnit unit11 = bloodUnitService.getBloodUnitById(19).orElse(null);
                Person staff11 = personService.getPersonById(20).orElse(null);
                Person receptor11 = personService.getPersonById(21).orElse(null);

                Transfusion transfusion11 = Transfusion.builder()
                                .transfusionDate(maybe4)
                                .observations("The recipient's energy levels improved noticeably after the transfusion.")
                                .unitsTransfusion(unit11)
                                .staff(staff11)
                                .receptor(receptor11)
                                .build();
                transfusionService.saveTransfusion(transfusion11);

                // 12
                BloodUnit unit12 = bloodUnitService.getBloodUnitById(18).orElse(null);
                Person staff12 = personService.getPersonById(3).orElse(null);
                Person receptor12 = personService.getPersonById(4).orElse(null);

                Transfusion transfusion12 = Transfusion.builder()
                                .transfusionDate(maybe3)
                                .observations("The recipient's family expressed gratitude for the prompt transfusion service.")
                                .unitsTransfusion(unit12)
                                .staff(staff12)
                                .receptor(receptor12)
                                .build();
                transfusionService.saveTransfusion(transfusion12);

                // 13
                BloodUnit unit13 = bloodUnitService.getBloodUnitById(17).orElse(null);
                Person staff13 = personService.getPersonById(9).orElse(null);
                Person receptor13 = personService.getPersonById(7).orElse(null);

                Transfusion transfusion13 = Transfusion.builder()
                                .transfusionDate(new Date())
                                .observations("The recipient experienced a sense of well-being after the transfusion.")
                                .unitsTransfusion(unit13)
                                .staff(staff13)
                                .receptor(receptor13)
                                .build();
                transfusionService.saveTransfusion(transfusion13);

                // 14
                BloodUnit unit14 = bloodUnitService.getBloodUnitById(16).orElse(null);
                Person staff14 = personService.getPersonById(12).orElse(null);
                Person receptor14 = personService.getPersonById(10).orElse(null);

                Transfusion transfusion14 = Transfusion.builder()
                                .transfusionDate(maybe4)
                                .observations("The recipient was appreciative of the compassionate care received during the transfusion.")
                                .unitsTransfusion(unit14)
                                .staff(staff14)
                                .receptor(receptor14)
                                .build();
                transfusionService.saveTransfusion(transfusion14);

                // 15
                BloodUnit unit15 = bloodUnitService.getBloodUnitById(15).orElse(null);
                Person staff15 = personService.getPersonById(20).orElse(null);
                Person receptor15 = personService.getPersonById(13).orElse(null);

                Transfusion transfusion15 = Transfusion.builder()
                                .transfusionDate(maybe3)
                                .observations("The recipient's family expressed relief knowing the importance of the received blood.")
                                .unitsTransfusion(unit15)
                                .staff(staff15)
                                .receptor(receptor15)
                                .build();
                transfusionService.saveTransfusion(transfusion15);

                // 16
                BloodUnit unit16 = bloodUnitService.getBloodUnitById(14).orElse(null);
                Person staff16 = personService.getPersonById(3).orElse(null);
                Person receptor16 = personService.getPersonById(16).orElse(null);

                Transfusion transfusion16 = Transfusion.builder()
                                .transfusionDate(new Date())
                                .observations("The recipient was comforted by the caring and professional medical team during the transfusion.")
                                .unitsTransfusion(unit16)
                                .staff(staff16)
                                .receptor(receptor16)
                                .build();
                transfusionService.saveTransfusion(transfusion16);

                // 17
                BloodUnit unit17 = bloodUnitService.getBloodUnitById(13).orElse(null);
                Person staff17 = personService.getPersonById(9).orElse(null);
                Person receptor17 = personService.getPersonById(21).orElse(null);

                Transfusion transfusion17 = Transfusion.builder()
                                .transfusionDate(maybe4)
                                .observations("The recipient's condition stabilized post-transfusion, marking a positive outcome.")
                                .unitsTransfusion(unit17)
                                .staff(staff17)
                                .receptor(receptor17)
                                .build();
                transfusionService.saveTransfusion(transfusion17);

                // 18
                BloodUnit unit18 = bloodUnitService.getBloodUnitById(12).orElse(null);
                Person staff18 = personService.getPersonById(12).orElse(null);
                Person receptor18 = personService.getPersonById(4).orElse(null);

                Transfusion transfusion18 = Transfusion.builder()
                                .transfusionDate(maybe3)
                                .observations("The recipient's mood visibly improved after the successful blood transfusion.")
                                .unitsTransfusion(unit18)
                                .staff(staff18)
                                .receptor(receptor18)
                                .build();
                transfusionService.saveTransfusion(transfusion18);

                // 19
                BloodUnit unit19 = bloodUnitService.getBloodUnitById(11).orElse(null);
                Person staff19 = personService.getPersonById(20).orElse(null);
                Person receptor19 = personService.getPersonById(7).orElse(null);

                Transfusion transfusion19 = Transfusion.builder()
                                .transfusionDate(new Date())
                                .observations("The recipient's family expressed gratitude for the life-saving transfusion.")
                                .unitsTransfusion(unit19)
                                .staff(staff19)
                                .receptor(receptor19)
                                .build();
                transfusionService.saveTransfusion(transfusion19);

                // 20
                BloodUnit unit20 = bloodUnitService.getBloodUnitById(12).orElse(null);
                Person staff20 = personService.getPersonById(3).orElse(null);
                Person receptor20 = personService.getPersonById(10).orElse(null);

                Transfusion transfusion20 = Transfusion.builder()
                                .transfusionDate(maybe4)
                                .observations("The recipient's vital signs improved, indicating a positive response to the transfusion.")
                                .unitsTransfusion(unit20)
                                .staff(staff20)
                                .receptor(receptor20)
                                .build();
                transfusionService.saveTransfusion(transfusion20);

        }

}
