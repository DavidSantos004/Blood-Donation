package com.example.BloodDonation.repository;

import com.example.BloodDonation.model.EventResponsiblePerson;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EventResponsiblePersonRepository extends JpaRepository<EventResponsiblePerson, Integer> {

    List<EventResponsiblePerson> findByStaffEvent_idperson(Integer staffId);

    @Query("SELECT erp FROM EventResponsiblePerson erp")
    List<EventResponsiblePerson> findAllEventResponsiblePersons();

    @Query("SELECT erp FROM EventResponsiblePerson erp WHERE erp.id = :id")
    Optional<EventResponsiblePerson> findEventResponsiblePersonById(@Param("id") Integer id);

}
