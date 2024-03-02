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
@Table(name = "blood_units")
public class BloodUnit {

    @Id
    @SequenceGenerator(
        name = "blood_unit_sequence",
        sequenceName = "blood_unit_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        generator = "blood_unit_sequence",
        strategy = GenerationType.SEQUENCE
    )
    private Integer idUnit;

    @Column(name = "Donor_ID")
    private Integer donorId;

    @Column(name = "Blood_Type", nullable = false)
    private String bloodType;

    @Column(name = "Rh_Factor", nullable = false)
    private String rhFactor;

    @Column(name = "Donation_Date", nullable = false)
    private Date donationDate;

    @Column(name = "Status", nullable = false)
    private String status;

    @Column(name = "Volume_Content")
    private Double volumeContent;
}
