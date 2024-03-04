package com.example.BloodDonation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.BloodDonation.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    @Query("SELECT p FROM Person p WHERE p.blood_group = :bloodGroup AND p.rh_factor = :rhFactor")
    List<Person> findByBloodGroupAndRhFactorJPQL(@Param("bloodGroup") String bloodGroup,
            @Param("rhFactor") String rhFactor);

}
