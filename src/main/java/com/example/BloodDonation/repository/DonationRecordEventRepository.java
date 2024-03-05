package com.example.BloodDonation.repository;

import com.example.BloodDonation.model.BloodUnit;
import com.example.BloodDonation.model.DonationEvent;
import com.example.BloodDonation.model.DonationRecordEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DonationRecordEventRepository extends JpaRepository<DonationRecordEvent, Integer> {

    List<DonationRecordEvent> findByDonorEvent_idperson(Integer donorId);


    @Query("SELECT dre FROM DonationRecordEvent dre WHERE dre.events.id = :eventId")
    List<DonationRecordEvent> findByEventId(@Param("eventId") Integer eventId);

    @Query("SELECT dre FROM DonationRecordEvent dre WHERE dre.unitsEvent.id = :unitId")
    List<DonationRecordEvent> findByUnitId(@Param("unitId") Integer unitId);
}
