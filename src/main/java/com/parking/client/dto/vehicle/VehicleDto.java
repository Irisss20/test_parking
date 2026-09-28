package com.parking.client.dto.vehicle;

import com.parking.client.entity.Billing;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Data
public class VehicleDto {
    private UUID id;

    private String numberPlate;

    private String carModel;

    private int year;

    private Timestamp lastParked;

    private List<Billing> billingList;
}
