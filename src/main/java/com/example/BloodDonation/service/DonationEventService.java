package com.example.BloodDonation.service;

import com.example.BloodDonation.model.DonationEvent;
import com.example.BloodDonation.repository.DonationEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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

    public Optional<DonationEvent> updateDonationEvent(Integer id, DonationEvent updatedDonationEvent) {
        Optional<DonationEvent> existingDonationEvent = donationEventRepository.findById(id);

        if (existingDonationEvent.isPresent()) {
            DonationEvent donationEventToUpdate = existingDonationEvent.get();
            donationEventToUpdate.setEvent_date(updatedDonationEvent.getEvent_date());
            donationEventToUpdate.setCity(updatedDonationEvent.getCity());
            donationEventToUpdate.setAddress(updatedDonationEvent.getAddress());
            donationEventToUpdate.setDescription(updatedDonationEvent.getDescription());
            donationEventToUpdate.setStatus_event(updatedDonationEvent.getStatus_event());

            donationEventRepository.save(donationEventToUpdate);
            return Optional.of(donationEventToUpdate);
        } else {
            return Optional.empty();
        }
    }


    public void deleteDonationEvent(Integer id) {
        donationEventRepository.deleteById(id);
    }

    public List<DonationEvent> getEventsByAddress(String address) {
        return donationEventRepository.findByAddress(address);
    }

    public List<DonationEvent> findByStatus(String event){
        return donationEventRepository.findByStatus(event);
    }
    
    public List<DonationEvent> findByCity(String city){
        return donationEventRepository.findByCity(city);
    }
}
