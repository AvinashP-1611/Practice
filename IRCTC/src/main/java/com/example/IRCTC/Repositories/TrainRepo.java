package com.example.IRCTC.Repositories;

import com.example.IRCTC.Models.Passenger;
import com.example.IRCTC.Models.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainRepo extends JpaRepository<Train,Integer> {
    List<Passenger> findBySaD="select p from train p where p.source :x and p.~~destination :y";
    @Query(value = findBySaD)
    List<Passenger> findBySaD();

//    List<Passenger> findBySaD(String s);
}
