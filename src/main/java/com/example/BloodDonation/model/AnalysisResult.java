package com.example.BloodDonation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
    private Integer idResult;

    @ManyToOne
    @JoinColumn(name = "unit_id", nullable = false)
    private BloodUnit bloodUnit;

    @Column(name = "analysis_type", nullable = false)
    private String analysisType;

    @Column(name = "result", nullable = false)
    private String result;

    @Column(name = "analysis_date", nullable = false)
    private Date analysisDate;

    @Column(name = "observations")
    private String observations;
}
