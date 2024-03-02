package com.example.BloodDonation.service;

import com.example.BloodDonation.model.AnalysisResult;
import com.example.BloodDonation.repository.AnalysisResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnalysisResultService {

    private final AnalysisResultRepository analysisResultRepository;

    @Autowired
    public AnalysisResultService(AnalysisResultRepository analysisResultRepository) {
        this.analysisResultRepository = analysisResultRepository;
    }

    public List<AnalysisResult> getAllAnalysisResults() {
        return analysisResultRepository.findAll();
    }

    public Optional<AnalysisResult> getAnalysisResultById(Integer id) {
        return analysisResultRepository.findById(id);
    }

    public AnalysisResult saveAnalysisResult(AnalysisResult analysisResult) {
        return analysisResultRepository.save(analysisResult);
    }

    public void deleteAnalysisResult(Integer id) {
        analysisResultRepository.deleteById(id);
    }
}
