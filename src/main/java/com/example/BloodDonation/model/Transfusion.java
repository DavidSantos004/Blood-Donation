package com.example.BloodDonation.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "transfusions")
public class Transfusion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Transfusion")
    private Integer ID_Transfusion;

    @Temporal(TemporalType.DATE)
    @Column(name = "transfusion_date", nullable = false)
    private Date transfusionDate;
    
    @Column(name = "observations")
    private String observations;

    // Relationships

    @ManyToOne
    @JoinColumn(name = "unit_id", nullable = true)
    private BloodUnit unitsTransfusion;

    @ManyToOne
    @JoinColumn(name = "staff_transfusion_id", nullable = true)
    private Person staff;

    @ManyToOne
    @JoinColumn(name = "receptor_id", nullable = true)
    private Person receptor;
}
