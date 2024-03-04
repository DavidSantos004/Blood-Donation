package com.example.BloodDonation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = {"resultsUnits", "recordEventUnits", "resultsTranfusionUnits", "donor"})
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
    private Date donationdate;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "volume_content", nullable = true)
    private Double volume_content;

    // Relationships
    
    @JsonIgnore
    @OneToMany(mappedBy = "units", fetch = FetchType.EAGER)
    private List<AnalysisResult> resultsUnits;

    @JsonIgnore
    @OneToMany(mappedBy = "unitsEvent", fetch = FetchType.EAGER)
    private List<DonationRecordEvent> recordEventUnits;

    @JsonIgnore
    @OneToMany(mappedBy = "unitsTransfusion", fetch = FetchType.EAGER)
    private List<Transfusion> resultsTranfusionUnits;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "donor_id")
    private Person donor;
    
}
