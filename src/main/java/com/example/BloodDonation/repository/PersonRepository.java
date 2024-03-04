package com.example.BloodDonation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.BloodDonation.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

       // Consulta JPQL para obtener todas las personas que son donantes
       @Query("SELECT p FROM Person p WHERE p.user_type = 'Donor'")
       List<Person> findDonors();
   
       // Consulta JPQL para obtener todas las personas que son empleados
       @Query("SELECT p FROM Person p WHERE p.user_type = 'Employee'")
       List<Person> findEmployees();
   

}
