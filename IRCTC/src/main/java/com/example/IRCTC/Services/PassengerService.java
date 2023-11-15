package com.example.IRCTC.Services;

import com.example.IRCTC.Models.Passenger;
import com.example.IRCTC.Repositories.PassengerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PassengerService {
    @Autowired
    PassengerRepo passengerRepo;
    public String addPassenger(Passenger passenger) {
        passengerRepo.save(passenger);
        return "Passenger save successfully";
    }

    public List<Passenger> findByDate(Date date) {
        return passengerRepo.findByDate(date);
    }
}
