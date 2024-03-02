package com.example.BloodDonation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.BloodDonation.model.Transfusion;
import com.example.BloodDonation.service.TransfusionService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/transfusions")
public class TransfusionsController {

    private final TransfusionService transfusionService;

    @Autowired
    public TransfusionsController(TransfusionService transfusionService) {
        this.transfusionService = transfusionService;
    }

    @GetMapping
    public List<Transfusion> getAllTransfusions() {
        return transfusionService.getAllTransfusions();
    }

    @GetMapping("/{id}")
    public Optional<Transfusion> getTransfusionById(@PathVariable Integer id) {
        return transfusionService.getTransfusionById(id);
    }

    @PostMapping
    public Transfusion saveTransfusion(@RequestBody Transfusion transfusion) {
        return transfusionService.saveTransfusion(transfusion);
    }

    @DeleteMapping("/{id}")
    public void deleteTransfusion(@PathVariable Integer id) {
        transfusionService.deleteTransfusion(id);
    }
}
