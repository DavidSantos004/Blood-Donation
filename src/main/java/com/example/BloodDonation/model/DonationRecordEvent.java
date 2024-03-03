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
    private Integer ID_Donation;

    // Relationsships

    @ManyToOne
    @JoinColumn(name = "donor_event_id", nullable = false)
    private Person donorEvent;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private DonationEvent events;

    @ManyToOne
    @JoinColumn(name = "unit_id", nullable = false)
    private BloodUnit unitsEvent;

}
