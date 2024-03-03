package com.example.BloodDonation.model;

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

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "analysis_results")
public class AnalysisResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID_Result;

    @Column(name = "analysis_type", nullable = false)
    private String analysis_type;

    @Column(name = "result", nullable = false)
    private String result;

    @Temporal(TemporalType.DATE)
    @Column(name = "analysis_date", nullable = false)
    private Date analysis_date;

    @Column(name = "observations", nullable = true)
    private String observations;

    // Relationship

    @ManyToOne
    @JoinColumn(name = "unit_id", nullable = false)
    private BloodUnit units;

}
