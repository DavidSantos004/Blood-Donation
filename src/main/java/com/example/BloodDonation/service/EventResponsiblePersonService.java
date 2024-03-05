package com.example.BloodDonation.service;

import com.example.BloodDonation.model.EventResponsiblePerson;
import com.example.BloodDonation.repository.EventResponsiblePersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventResponsiblePersonService {

    private final EventResponsiblePersonRepository eventResponsiblePersonRepository;

    @Autowired
    public EventResponsiblePersonService(EventResponsiblePersonRepository eventResponsiblePersonRepository) {
        this.eventResponsiblePersonRepository = eventResponsiblePersonRepository;
    }

    public List<EventResponsiblePerson> getAllEventResponsiblePersons() {
        return eventResponsiblePersonRepository.findAll();
    }

    public Optional<EventResponsiblePerson> getEventResponsiblePersonById(Integer id) {
        return eventResponsiblePersonRepository.findById(id);
    }

    public EventResponsiblePerson saveEventResponsiblePerson(EventResponsiblePerson eventResponsiblePerson) {
        return eventResponsiblePersonRepository.save(eventResponsiblePerson);
    }

    public void deleteEventResponsiblePerson(Integer id) {
        eventResponsiblePersonRepository.deleteById(id);
    }

    public List<EventResponsiblePerson> findEventResponsiblePersonsByStaffId(Integer staffId) {
        return eventResponsiblePersonRepository.findByStaffEvent_idperson(staffId);
    }
   
    public List<EventResponsiblePerson> findAllEventResponsiblePersons() {
        return eventResponsiblePersonRepository.findAllEventResponsiblePersons();
    }

    public Optional<EventResponsiblePerson> findEventResponsiblePersonById(Integer id) {
        return eventResponsiblePersonRepository.findEventResponsiblePersonById(id);
    }

    public Optional<EventResponsiblePerson> updateEventResponsiblePerson(Integer id, EventResponsiblePerson updatedEventResponsiblePerson) {
        Optional<EventResponsiblePerson> existingEventResponsiblePerson = eventResponsiblePersonRepository.findById(id);

        if (existingEventResponsiblePerson.isPresent()) {
            EventResponsiblePerson eventResponsiblePersonToUpdate = existingEventResponsiblePerson.get();
            eventResponsiblePersonToUpdate.setStaffEvent(updatedEventResponsiblePerson.getStaffEvent());
            eventResponsiblePersonToUpdate.setEventsResponsible(updatedEventResponsiblePerson.getEventsResponsible());

            eventResponsiblePersonRepository.save(eventResponsiblePersonToUpdate);
            return Optional.of(eventResponsiblePersonToUpdate);
        } else {
            return Optional.empty();
        }

    }

}
