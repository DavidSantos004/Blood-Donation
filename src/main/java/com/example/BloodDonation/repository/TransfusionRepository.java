package com.example.BloodDonation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BloodDonation.model.Transfusion;

@Repository
public interface TransfusionRepository extends JpaRepository<Transfusion, Integer> {
}
