package com.example.BloodDonation.repository;

import com.example.BloodDonation.model.AnalysisResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalysisResultRepository extends JpaRepository<AnalysisResult, Integer> {
    
}
