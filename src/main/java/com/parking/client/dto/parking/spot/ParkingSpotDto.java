package com.parking.client.dto.parking.spot;

import com.parking.client.enums.ParkingSpotStatus;
import com.parking.client.enums.VehicleType;
import lombok.Data;

import java.util.UUID;

@Data
public class ParkingSpotDto {
    private UUID id;

    private int floorNumber;

    private VehicleType vehicleType;

    private ParkingSpotStatus status;
}
