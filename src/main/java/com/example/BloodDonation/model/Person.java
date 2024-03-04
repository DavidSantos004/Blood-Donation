package com.example.BloodDonation.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString(exclude = {"unitsPerson", "transfusionsPerson", "transfusions2Person", "eventsPerson", "eventsRecordPerson"})
@AllArgsConstructor
@NoArgsConstructor
@Builder

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
    private Integer ID_person;

    @Column(
        nullable = false
    )
    private String first_name;

    @Column(
        nullable = false
    )
    private String last_name;

    @Column(
        name = "dni",
        nullable = false,
        unique = true
    )
    private String dni;

    @Column(name = "user_type", nullable = false)
    private String user_type;

    @Column(name = "blood_group", nullable = true)
    private String bloodgroup;

    @Column(name = "rh_factor", nullable = true)
    private String rh_factor;

    @Temporal(TemporalType.DATE)
    private Date birthdate;

    @Column(name = "address", nullable = true)
    private String address;

    @Column(
        name = "phone", 
        unique= true
    )
    private String phone;

    @Column(
        name = "email",
        unique = true
    )
    private String email;

    @Temporal(TemporalType.DATE)
    private Date last_donation;

    @Column(name = "role", nullable = true)
    private String role;

    // Relationsships

    @JsonIgnore
    @OneToMany(mappedBy = "donor", fetch = FetchType.EAGER)
    private List<BloodUnit> unitsPerson;

    @JsonIgnore
    @OneToMany(mappedBy = "staff", fetch = FetchType.EAGER)
    private List<Transfusion> transfusionsPerson;

    @JsonIgnore
    @OneToMany(mappedBy = "receptor", fetch = FetchType.EAGER)
    private List<Transfusion> transfusions2Person;

    @JsonIgnore
    @OneToMany(mappedBy = "staffEvent", fetch = FetchType.EAGER)
    private List<EventResponsiblePerson> eventsPerson;

    @JsonIgnore
    @OneToMany(mappedBy = "donorEvent", fetch = FetchType.EAGER)
    private List<DonationRecordEvent> eventsRecordPerson;
}
