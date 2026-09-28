package com.parking.client.dto.billing;

import com.parking.client.entity.ParkingSpot;
import com.parking.client.entity.Vehicle;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Data
public class BillingDto {
    private UUID id;

    private Timestamp checkedIn;

    private Timestamp checkedOut;

    private Vehicle vehicle;

    private ParkingSpot parkingSpot;
}
