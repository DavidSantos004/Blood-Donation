package com.example.BloodDonation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private Integer idEventResponsiblePerson;

    @ManyToOne
    @JoinColumn(name = "Person_ID", nullable = false)
    private Person person;

    @ManyToOne
    @JoinColumn(name = "Event_ID", nullable = false)
    private DonationEvent donationEvent;
}
