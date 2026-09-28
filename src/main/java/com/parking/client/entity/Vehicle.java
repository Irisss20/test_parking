package com.parking.client.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String numberPlate;

    private String carModel;

    private int year;

    private Timestamp lastParked;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "vehicle")
    private List<Billing> billingList;
}
