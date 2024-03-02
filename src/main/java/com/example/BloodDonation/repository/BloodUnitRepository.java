package com.example.BloodDonation.repository;

import com.example.BloodDonation.model.BloodUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodUnitRepository extends JpaRepository<BloodUnit, Integer> {
}
