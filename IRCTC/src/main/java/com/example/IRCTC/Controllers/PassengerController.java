package com.example.IRCTC.Controllers;

import com.example.IRCTC.Models.Passenger;
import com.example.IRCTC.Services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
    @Autowired
    PassengerService passengerService;

    @PostMapping("/addPassenger")
    public ResponseEntity addPassenger(@RequestBody Passenger passenger){
        String savepassenger=passengerService.addPassenger(passenger);
        return new ResponseEntity(savepassenger, HttpStatus.CREATED);
    }

    @GetMapping("/findByDate/{date}")
    public ResponseEntity findByDate(@PathVariable Date date){
        List<Passenger> savepassenger=passengerService.findByDate(date);
        return new ResponseEntity(savepassenger, HttpStatus.CREATED);
    }

}
