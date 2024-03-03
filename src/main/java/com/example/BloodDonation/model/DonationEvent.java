package com.example.BloodDonation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
    name = "donation_event",
    uniqueConstraints = @UniqueConstraint(
        name = "event_date_city_unique",
        columnNames = {"Event_Date"}
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
    private Integer ID_Event;

    @Temporal(TemporalType.DATE)
    private Date event_date;

    @Column(name = "city", nullable = true)
    private String city;

    @Column(name = "address", nullable = true)
    private String address;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "status_event", nullable = true)
    private String status_event;

    // Relationships

    @OneToMany(mappedBy = "events")
    private List<DonationRecordEvent> donationRecordEvent;

    @OneToMany(mappedBy = "eventsResponsible")
    private List<EventResponsiblePerson> responsibleEvent;

}
