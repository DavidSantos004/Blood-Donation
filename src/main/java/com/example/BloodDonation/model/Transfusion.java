package com.example.BloodDonation.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

    @Column(name = "Unit_ID", nullable = false)
    private Integer unitId;

    @Column(name = "Person_ID")
    private Integer personId;

    @Column(name = "Transfusion_Date", nullable = false)
    private Date transfusionDate;

    @Column(name = "Recipient_ID")
    private Integer recipientId;

    @Column(name = "Observations")
    private String observations;
}
