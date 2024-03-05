package com.example.BloodDonation.service;

import com.example.BloodDonation.model.AnalysisResult;
import com.example.BloodDonation.model.BloodUnit;
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

    public Optional<AnalysisResult> updateAnalysisResult(Integer id, AnalysisResult updatedAnalysisResult) {
        Optional<AnalysisResult> existingAnalysisResult = analysisResultRepository.findById(id);

        if (existingAnalysisResult.isPresent()) {
            AnalysisResult analysisResultToUpdate = existingAnalysisResult.get();
            // Actualiza las propiedades según sea necesario
            analysisResultToUpdate.setAnalysis_type(updatedAnalysisResult.getAnalysis_type());
            analysisResultToUpdate.setResult(updatedAnalysisResult.getResult());
            analysisResultToUpdate.setAnalysis_date(updatedAnalysisResult.getAnalysis_date());
            analysisResultToUpdate.setObservations(updatedAnalysisResult.getObservations());

            analysisResultRepository.save(analysisResultToUpdate);
            return Optional.of(analysisResultToUpdate);
        } else {
            return Optional.empty();
        }
    }

    public List<AnalysisResult> findAnalysisResultByType(String type){
        return analysisResultRepository.findAnalysisResultByType(type);
    }

    public List<AnalysisResult> findAnalysisResultByResult(String resultType){
        return analysisResultRepository.findAnalysisResultByResult(resultType);
    }

    public Optional<List<AnalysisResult>> getAnalysisResultByUnits(BloodUnit units) {
        return analysisResultRepository.findByUnits(units);
    }

}