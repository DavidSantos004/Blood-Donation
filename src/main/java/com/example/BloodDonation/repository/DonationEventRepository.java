package com.example.BloodDonation.repository;

import com.example.BloodDonation.model.DonationEvent;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationEventRepository extends JpaRepository<DonationEvent, Integer> {

    List<DonationEvent> findByAddress(String address);

     @Query("SELECT o FROM DonationEvent o WHERE o.status_event = :event")
    List<DonationEvent> findByStatus(String event);

    @Query("SELECT o FROM DonationEvent o WHERE o.city = :city")
    List<DonationEvent> findByCity(String city);
}
