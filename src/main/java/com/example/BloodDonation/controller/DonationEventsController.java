package com.example.BloodDonation.controller;

import com.example.BloodDonation.model.DonationEvent;
import com.example.BloodDonation.service.DonationEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/donationevents")
public class DonationEventsController {

    private final DonationEventService donationEventService;

    @Autowired
    public DonationEventsController(DonationEventService donationEventService) {
        this.donationEventService = donationEventService;
    }

    @GetMapping
    public List<DonationEvent> getAllDonationEvents() {
        return donationEventService.getAllDonationEvents();
    }

    @GetMapping("/{id}")
    public Optional<DonationEvent> getDonationEventById(@PathVariable Integer id) {
        return donationEventService.getDonationEventById(id);
    }

    @PostMapping
    public DonationEvent saveDonationEvent(@RequestBody DonationEvent donationEvent) {
        return donationEventService.saveDonationEvent(donationEvent);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DonationEvent> updateDonationEvent(@PathVariable Integer id, @RequestBody DonationEvent updatedDonationEvent) {
        Optional<DonationEvent> donationEvent = donationEventService.updateDonationEvent(id, updatedDonationEvent);
        return donationEvent.map(ResponseEntity::ok)
                           .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void deleteDonationEvent(@PathVariable Integer id) {
        donationEventService.deleteDonationEvent(id);
    }
}
