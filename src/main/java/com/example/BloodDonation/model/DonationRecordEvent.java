package com.example.BloodDonation.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
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

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "donor_event_id", nullable = false)
    private Person donorEvent;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private DonationEvent events;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "unit_id", nullable = false)
    private BloodUnit unitsEvent;

}
