package com.example.BloodDonation.repository;

import com.example.BloodDonation.model.DonationEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationEventRepository extends JpaRepository<DonationEvent, Integer> {
}
