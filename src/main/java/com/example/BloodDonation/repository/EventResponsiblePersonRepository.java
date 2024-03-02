package com.example.BloodDonation.repository;

import com.example.BloodDonation.model.EventResponsiblePerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventResponsiblePersonRepository extends JpaRepository<EventResponsiblePerson, Integer> {
}
