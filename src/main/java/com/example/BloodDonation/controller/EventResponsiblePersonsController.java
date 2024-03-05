package com.example.BloodDonation.controller;

import com.example.BloodDonation.model.EventResponsiblePerson;
import com.example.BloodDonation.service.EventResponsiblePersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/eventresponsiblepersons")
public class EventResponsiblePersonsController {

    private final EventResponsiblePersonService eventResponsiblePersonService;

    @Autowired
    public EventResponsiblePersonsController(EventResponsiblePersonService eventResponsiblePersonService) {
        this.eventResponsiblePersonService = eventResponsiblePersonService;
    }

    @GetMapping
    public List<EventResponsiblePerson> getAllEventResponsiblePersons() {
        return eventResponsiblePersonService.getAllEventResponsiblePersons();
    }

    @GetMapping("/{id}")
    public Optional<EventResponsiblePerson> getEventResponsiblePersonById(@PathVariable Integer id) {
        return eventResponsiblePersonService.getEventResponsiblePersonById(id);
    }

    @PostMapping
    public EventResponsiblePerson saveEventResponsiblePerson(@RequestBody EventResponsiblePerson eventResponsiblePerson) {
        return eventResponsiblePersonService.saveEventResponsiblePerson(eventResponsiblePerson);
    }

     @PutMapping("/{id}")
    public ResponseEntity<EventResponsiblePerson> updateEventResponsiblePerson(@PathVariable Integer id, @RequestBody EventResponsiblePerson updatedEventResponsiblePerson) {
        Optional<EventResponsiblePerson> eventResponsiblePerson = eventResponsiblePersonService.updateEventResponsiblePerson(id, updatedEventResponsiblePerson);
        return eventResponsiblePerson.map(ResponseEntity::ok)
                                     .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void deleteEventResponsiblePerson(@PathVariable Integer id) {
        eventResponsiblePersonService.deleteEventResponsiblePerson(id);
    }
}
