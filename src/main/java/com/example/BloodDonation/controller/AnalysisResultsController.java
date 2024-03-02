package com.example.BloodDonation.controller;

import com.example.BloodDonation.model.AnalysisResult;
import com.example.BloodDonation.service.AnalysisResultService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @DeleteMapping("/{id}")
    public void deleteAnalysisResult(@PathVariable Integer id) {
        analysisResultService.deleteAnalysisResult(id);
    }
}
