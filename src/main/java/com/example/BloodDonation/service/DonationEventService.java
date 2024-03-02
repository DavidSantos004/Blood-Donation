package com.example.BloodDonation.service;

import com.example.BloodDonation.model.DonationEvent;
import com.example.BloodDonation.repository.DonationEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DonationEventService {

    private final DonationEventRepository donationEventRepository;

    @Autowired
    public DonationEventService(DonationEventRepository donationEventRepository) {
        this.donationEventRepository = donationEventRepository;
    }

    public List<DonationEvent> getAllDonationEvents() {
        return donationEventRepository.findAll();
    }

    public Optional<DonationEvent> getDonationEventById(Integer id) {
        return donationEventRepository.findById(id);
    }

    public DonationEvent saveDonationEvent(DonationEvent donationEvent) {
        return donationEventRepository.save(donationEvent);
    }

    public void deleteDonationEvent(Integer id) {
        donationEventRepository.deleteById(id);
    }
}
