package com.example.IRCTC.Models;

import com.example.IRCTC.Models.Passenger;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="train")
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    int trainId;

    String source;

    String destination;

    @OneToMany(mappedBy = "train", cascade = CascadeType.ALL)
    List<Passenger> passengerList = new ArrayList<>();


}
