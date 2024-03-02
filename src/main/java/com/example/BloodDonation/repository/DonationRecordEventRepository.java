package com.example.BloodDonation.repository;

import com.example.BloodDonation.model.DonationRecordEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationRecordEventRepository extends JpaRepository<DonationRecordEvent, Integer> {
}
