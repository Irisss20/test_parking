package com.parking.client.entity;

import com.parking.client.enums.ParkingSpotStatus;
import com.parking.client.enums.VehicleType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParkingSpot {
    @Id
    private Long id;

    private int floorNumber;

    private VehicleType vehicleType;

    private ParkingSpotStatus status;
 
}
