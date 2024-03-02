package com.example.BloodDonation.service;

import com.example.BloodDonation.model.DonationRecordEvent;
import com.example.BloodDonation.repository.DonationRecordEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DonationRecordEventService {

    private final DonationRecordEventRepository donationRecordEventRepository;

    @Autowired
    public DonationRecordEventService(DonationRecordEventRepository donationRecordEventRepository) {
        this.donationRecordEventRepository = donationRecordEventRepository;
    }

    public List<DonationRecordEvent> getAllDonationRecordEvents() {
        return donationRecordEventRepository.findAll();
    }

    public Optional<DonationRecordEvent> getDonationRecordEventById(Integer id) {
        return donationRecordEventRepository.findById(id);
    }

    public DonationRecordEvent saveDonationRecordEvent(DonationRecordEvent donationRecordEvent) {
        return donationRecordEventRepository.save(donationRecordEvent);
    }

    public void deleteDonationRecordEvent(Integer id) {
        donationRecordEventRepository.deleteById(id);
    }
}
