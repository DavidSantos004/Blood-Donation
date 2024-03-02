package com.example.BloodDonation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BloodDonation.model.Transfusion;
import com.example.BloodDonation.repository.TransfusionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TransfusionService {

    private final TransfusionRepository transfusionRepository;

    @Autowired
    public TransfusionService(TransfusionRepository transfusionRepository) {
        this.transfusionRepository = transfusionRepository;
    }

    public List<Transfusion> getAllTransfusions() {
        return transfusionRepository.findAll();
    }

    public Optional<Transfusion> getTransfusionById(Integer id) {
        return transfusionRepository.findById(id);
    }

    public Transfusion saveTransfusion(Transfusion transfusion) {
        return transfusionRepository.save(transfusion);
    }

    public void deleteTransfusion(Integer id) {
        transfusionRepository.deleteById(id);
    }
}
