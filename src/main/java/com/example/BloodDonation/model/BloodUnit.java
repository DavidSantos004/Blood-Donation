package com.example.BloodDonation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


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
    private Integer ID_Unit;

    

    @Column(name = "blood_type", nullable = false)
    private String blood_type;

    @Column(name = "rh_factor", nullable = false)
    private String rh_factor;

    @Temporal(TemporalType.DATE)
    @Column(name = "donation_date", nullable = false)
    private Date donation_date;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "volume_content", nullable = true)
    private Double volume_content;

    // Relationships
    
    @OneToMany(mappedBy = "units")
    private List<AnalysisResult> resultsUnits;

    @OneToMany(mappedBy = "unitsEvent")
    private List<DonationRecordEvent> recordEventUnits;

    @OneToMany(mappedBy = "unitsTransfusion")
    private List<Transfusion> resultsTranfusionUnits;

    @ManyToOne
    @JoinColumn(name = "donor_id")
    private Person donor;
    
}
