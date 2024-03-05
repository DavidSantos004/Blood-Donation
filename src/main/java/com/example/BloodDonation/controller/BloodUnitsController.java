package com.example.BloodDonation.controller;

import com.example.BloodDonation.model.BloodUnit;
import com.example.BloodDonation.service.BloodUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bloodunits")
public class BloodUnitsController {

    private final BloodUnitService bloodUnitService;

    @Autowired
    public BloodUnitsController(BloodUnitService bloodUnitService) {
        this.bloodUnitService = bloodUnitService;
    }

    @GetMapping
    public List<BloodUnit> getAllBloodUnits() {
        return bloodUnitService.getAllBloodUnits();
    }

    @GetMapping("/{id}")
    public Optional<BloodUnit> getBloodUnitById(@PathVariable Integer id) {
        return bloodUnitService.getBloodUnitById(id);
    }

    @PostMapping
    public BloodUnit saveBloodUnit(@RequestBody BloodUnit bloodUnit) {
        return bloodUnitService.saveBloodUnit(bloodUnit);
    }

     @PutMapping("/{id}")
    public ResponseEntity<BloodUnit> updateBloodUnit(@PathVariable Integer id, @RequestBody BloodUnit updatedBloodUnit) {
        Optional<BloodUnit> bloodUnit = bloodUnitService.updateBloodUnit(id, updatedBloodUnit);
        return bloodUnit.map(ResponseEntity::ok)
                        .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void deleteBloodUnit(@PathVariable Integer id) {
        bloodUnitService.deleteBloodUnit(id);
    }
}
