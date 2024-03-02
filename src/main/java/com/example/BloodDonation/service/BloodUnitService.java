package com.example.BloodDonation.service;

import com.example.BloodDonation.model.BloodUnit;
import com.example.BloodDonation.repository.BloodUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BloodUnitService {

    private final BloodUnitRepository bloodUnitRepository;

    @Autowired
    public BloodUnitService(BloodUnitRepository bloodUnitRepository) {
        this.bloodUnitRepository = bloodUnitRepository;
    }

    public List<BloodUnit> getAllBloodUnits() {
        return bloodUnitRepository.findAll();
    }

    public Optional<BloodUnit> getBloodUnitById(Integer id) {
        return bloodUnitRepository.findById(id);
    }

    public BloodUnit saveBloodUnit(BloodUnit bloodUnit) {
        return bloodUnitRepository.save(bloodUnit);
    }

    public void deleteBloodUnit(Integer id) {
        bloodUnitRepository.deleteById(id);
    }
}
