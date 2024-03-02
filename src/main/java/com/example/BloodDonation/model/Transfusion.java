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
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transfusions")
public class Transfusion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Transfusion")
    private Integer idTransfusion;

    @ManyToOne
    @JoinColumn(name = "Unit_ID", nullable = false)
    private Integer unitId;

    @ManyToOne
    @JoinColumn(name = "Person_ID", nullable = true)
    private Integer personId;

    @Temporal(TemporalType.DATE)
    @Column(name = "Transfusion_Date", nullable = false)
    private Date transfusionDate;

    @ManyToOne
    @JoinColumn(name = "Recipient_ID", nullable = true)
    private Integer recipientId;

    @Column(name = "Observations")
    private String observations;
}
