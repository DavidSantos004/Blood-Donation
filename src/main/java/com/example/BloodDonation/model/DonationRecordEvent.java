package com.example.BloodDonation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "donation_records_events")
public class DonationRecordEvent {

    @Id
    @SequenceGenerator(
            name = "donation_record_event_sequence",
            sequenceName = "donation_record_event_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "donation_record_event_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Integer idDonation;

    @ManyToOne
    @JoinColumn(name = "Person_ID", nullable = false)
    private Person person;

    @ManyToOne
    @JoinColumn(name = "Event_ID", nullable = false)
    private DonationEvent donationEvent;

    @ManyToOne
    @JoinColumn(name = "Unit_ID", nullable = false)
    private BloodUnit bloodUnit;
}
