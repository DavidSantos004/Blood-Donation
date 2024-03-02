package com.example.BloodDonation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(
    name = "donation_event",
    uniqueConstraints = @UniqueConstraint(
        name = "event_date_city_unique",
        columnNames = {"Event_Date", "City"}
    )
)
public class DonationEvent {

    @Id
    @SequenceGenerator(
        name = "donation_event_sequence",
        sequenceName = "donation_event_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        generator = "donation_event_sequence",
        strategy = GenerationType.SEQUENCE
    )
    private Integer eventId;

    @Temporal(TemporalType.DATE)
    private Date eventDate;

    private String city;

    private String address;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String status;
}
