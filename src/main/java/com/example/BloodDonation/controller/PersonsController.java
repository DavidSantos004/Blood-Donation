package com.example.BloodDonation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BloodDonation.model.Person;
import com.example.BloodDonation.service.PersonService;

@RestController
@RequestMapping("/api/persons")
public class PersonsController {

    private final PersonService personService;

    @Autowired
    public PersonsController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/{id}")
public ResponseEntity<Person> getPersonById(@PathVariable Integer id) {
    Optional<Person> person = personService.getPersonById(id);
    return person.map(ResponseEntity::ok)
                 .orElseGet(() -> ResponseEntity.notFound().build());
}

    @PostMapping
    public Person savePerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Integer id) {
        personService.deletePerson(id);
    }
}
