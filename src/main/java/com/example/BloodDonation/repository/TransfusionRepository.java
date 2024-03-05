package com.example.BloodDonation.repository;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.BloodDonation.model.Transfusion;

@Repository
public interface TransfusionRepository extends JpaRepository<Transfusion, Integer> {

     @Query("SELECT NEW map(t.ID_Transfusion as ID_Transfusion, t.transfusionDate as transfusionDate, t.observations as observations) FROM Transfusion t WHERE t.unitsTransfusion.id = :id")
    List<Map<String, Object>> findTransfusionInfoByUnit(@Param("id") Integer id);

    List<Transfusion> findByTransfusionDate(Date transfusionDate);

    @Query("SELECT t.receptor.id, t.staff.id, t.unitsTransfusion.id FROM Transfusion t WHERE t.ID_Transfusion = :transfusionId")
    List<Object[]> findCustomDataById(Integer transfusionId);

}
