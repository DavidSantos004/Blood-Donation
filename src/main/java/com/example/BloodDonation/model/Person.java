package com.example.BloodDonation.model;

import java.util.Date;
import java.util.List;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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

@Entity
@Data
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
    private String blood_group;

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

    @OneToMany(mappedBy = "donor")
    private List<BloodUnit> unitsPerson;

    @OneToMany(mappedBy = "staff")
    private List<Transfusion> transfusionsPerson;

    @OneToMany(mappedBy = "receptor")
    private List<Transfusion> transfusions2Person;

    @OneToMany(mappedBy = "staffEvent")
    private List<EventResponsiblePerson> eventsPerson;

    @OneToMany(mappedBy = "donorEvent")
    private List<DonationRecordEvent> eventsRecordPerson;
}
