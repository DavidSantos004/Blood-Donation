package com.example.BloodDonation.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString(exclude = {"staffEvent", "eventsResponsible"})
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "event_responsible_persons")
public class EventResponsiblePerson {

    @Id
    @SequenceGenerator(
            name = "event_responsible_person_sequence",
            sequenceName = "event_responsible_person_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "event_responsible_person_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Integer ID_Event_Responsible_Person;

    // Relationsships

    @ManyToOne
    @JoinColumn(name = "staff_event_id", nullable = false)
    private Person staffEvent;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private DonationEvent eventsResponsible;
}
