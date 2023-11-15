package com.example.IRCTC.Services;

import com.example.IRCTC.Models.Passenger;
import com.example.IRCTC.Models.Train;
import com.example.IRCTC.Repositories.TrainRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {
    @Autowired
    TrainRepo trainRepo;
    public String addTrain(Train train) {
        trainRepo.save(train);
        return "train save successfully";
    }

    public List findBySaD(String s) {
        List<Passenger> passengerList=trainRepo.findBySaD();
        return passengerList;

    }
}
