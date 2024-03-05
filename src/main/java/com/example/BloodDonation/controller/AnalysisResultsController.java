package com.example.BloodDonation.controller;

import com.example.BloodDonation.model.AnalysisResult;
import com.example.BloodDonation.service.AnalysisResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/analysisresults")
public class AnalysisResultsController {

    private final AnalysisResultService analysisResultService;

    @Autowired
    public AnalysisResultsController(AnalysisResultService analysisResultService) {
        this.analysisResultService = analysisResultService;
    }

    @GetMapping
    public List<AnalysisResult> getAllAnalysisResults() {
        return analysisResultService.getAllAnalysisResults();
    }

    @GetMapping("/{id}")
    public Optional<AnalysisResult> getAnalysisResultById(@PathVariable Integer id) {
        return analysisResultService.getAnalysisResultById(id);
    }

    @PostMapping
    public AnalysisResult saveAnalysisResult(@RequestBody AnalysisResult analysisResult) {
        return analysisResultService.saveAnalysisResult(analysisResult);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AnalysisResult> updateAnalysisResult(@PathVariable Integer id, @RequestBody AnalysisResult updatedAnalysisResult) {
        Optional<AnalysisResult> analysisResult = analysisResultService.updateAnalysisResult(id, updatedAnalysisResult);
        return analysisResult.map(ResponseEntity::ok)
                        .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void deleteAnalysisResult(@PathVariable Integer id) {
        analysisResultService.deleteAnalysisResult(id);
    }
}
