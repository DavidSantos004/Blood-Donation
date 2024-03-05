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


    public Optional<Person> updatePerson(Integer id, Person updatedPerson) {
        Optional<Person> existingPerson = personRepository.findById(id);

        if (existingPerson.isPresent()) {
            Person personToUpdate = existingPerson.get();
            personToUpdate.setFirst_name(updatedPerson.getFirst_name());
            personToUpdate.setLast_name(updatedPerson.getLast_name());
            personToUpdate.setDni(updatedPerson.getDni());
            personToUpdate.setUser_type(updatedPerson.getUser_type());
            personToUpdate.setBloodgroup(updatedPerson.getBloodgroup());
            personToUpdate.setRh_factor(updatedPerson.getRh_factor());
            personToUpdate.setBirthdate(updatedPerson.getBirthdate());
            personToUpdate.setAddress(updatedPerson.getAddress());
            personToUpdate.setPhone(updatedPerson.getPhone());
            personToUpdate.setEmail(updatedPerson.getEmail());
            personToUpdate.setLast_donation(updatedPerson.getLast_donation());
            personToUpdate.setRole(updatedPerson.getRole());

            personRepository.save(personToUpdate);
            return Optional.of(personToUpdate);
        } else {
            return Optional.empty();
        }
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
