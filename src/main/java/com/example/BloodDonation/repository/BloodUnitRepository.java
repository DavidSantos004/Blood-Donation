package com.example.BloodDonation.repository;

import com.example.BloodDonation.model.BloodUnit;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodUnitRepository extends JpaRepository<BloodUnit, Integer> {
    List<BloodUnit> findByDonationdate(Date donationdate);

    @Query("SELECT bu FROM BloodUnit bu WHERE bu.donor.bloodgroup = :bloodGroup")
    List<BloodUnit> findBloodUnitsByDonorBloodGroup(String bloodGroup);

    @Query("SELECT bu FROM BloodUnit bu WHERE bu.volume_content > :minVolume")
    List<BloodUnit> findBloodUnitsByVolumeContentGreaterThan(double minVolume);

}
