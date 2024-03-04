package com.example.BloodDonation.service;

import com.example.BloodDonation.model.Person;
import com.example.BloodDonation.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public Optional<Person> getPersonById(Integer id) {
        return personRepository.findById(id);
    }

    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    public void deletePerson(Integer id) {
        personRepository.deleteById(id);
    }

    public List<Person> findByBloodGroup(String bloodGroup) {
        return personRepository.findByBloodgroup(bloodGroup);
    }

    public List<Person> getDonors() {
        return personRepository.findDonors();
    }

    public List<Person> getEmployees() {
        return personRepository.findEmployees();
    }
    
}
