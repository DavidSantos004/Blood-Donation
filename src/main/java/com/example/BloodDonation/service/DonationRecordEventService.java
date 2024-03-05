package com.example.BloodDonation.service;

import com.example.BloodDonation.model.BloodUnit;
import com.example.BloodDonation.model.DonationEvent;
import com.example.BloodDonation.model.DonationRecordEvent;
import com.example.BloodDonation.repository.DonationRecordEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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

    public List<DonationRecordEvent> findDonationRecordEventsByDonorId(Integer donorId) {
        return donationRecordEventRepository.findByDonorEvent_idperson(donorId);
    }

    public List<DonationRecordEvent> findByEventId(Integer eventId) {
        return donationRecordEventRepository.findByEventId(eventId);
    }

    public List<DonationRecordEvent> findByUnitId(Integer unitId) {
        return donationRecordEventRepository.findByUnitId(unitId);
    }

    

}
