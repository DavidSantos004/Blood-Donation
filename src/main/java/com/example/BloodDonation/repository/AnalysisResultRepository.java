package com.example.BloodDonation.repository;

import com.example.BloodDonation.model.AnalysisResult;
import com.example.BloodDonation.model.BloodUnit;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalysisResultRepository extends JpaRepository<AnalysisResult, Integer> {
    
    @Query("SELECT a FROM AnalysisResult a WHERE a.analysis_type = :type")
    List<AnalysisResult> findAnalysisResultByType(String type);

    @Query("SELECT a FROM AnalysisResult a WHERE a.result = :resultType")
    List<AnalysisResult> findAnalysisResultByResult(String resultType);

    Optional<List<AnalysisResult>> findByUnits(BloodUnit units);
}
