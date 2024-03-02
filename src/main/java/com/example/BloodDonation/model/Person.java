package com.example.BloodDonation.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personId;

    private String firstName;

    private String lastName;

    private String documentNumber;

    private String userType;

    private String bloodGroup;

    private String rhFactor;

    private Date dateOfBirth;

    private String address;

    private String phone;

    private String email;

    private Date lastDonation;

    private String position;
}
