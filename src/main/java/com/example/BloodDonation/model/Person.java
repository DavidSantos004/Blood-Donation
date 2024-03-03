package com.example.BloodDonation.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(
    name = "person",
    uniqueConstraints = {
        @UniqueConstraint(name = "dni_unique", columnNames = "Dni"),
        @UniqueConstraint(name = "phone_unique", columnNames = "Phone"),
        @UniqueConstraint(name = "email_unique", columnNames = "Email")
    }
)
public class Person {

    @Id
    @SequenceGenerator(
        name="person_sequence",
        sequenceName = "person_sequence",
        allocationSize = 1
    )

    @GeneratedValue(
        generator = "person_sequence",
        strategy = GenerationType.SEQUENCE
        )
    private Integer personId;

    
    @Column(
        nullable = false
    )
    private String firstName;

    @Column(
        nullable = false
    )
    private String lastName;

    @Column(
        name = "Dni",
        nullable = false,
        unique = true
    )
    private String Dni;

    @Column(name = "User_Type", nullable = false)
    private String userType;

    @Column(name = "Blood_Group", nullable = true)
    private String bloodGroup;

    @Column(name = "Rh_Factor", nullable = true)
    private String rhFactor;

    @Temporal(TemporalType.DATE)
    private Date Birthdate;

    @Column(name = "Address", nullable = true)
    private String address;

    @Column(
        name = "Phone", 
        unique= true
    )
    private String phone;

    @Column(
        name = "Email",
        unique = true
    )
    private String email;

    @Temporal(TemporalType.DATE)
    private Date lastDonation;

    @Column(name = "Role", nullable = true)
    private String position;
}
