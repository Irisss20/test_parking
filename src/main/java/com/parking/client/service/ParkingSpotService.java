package com.parking.client.service;

import com.parking.client.dto.parking.spot.ParkingSpotDto;
import com.parking.client.dto.parking.spot.ParkingSpotSaveDto;
import org.springframework.data.domain.Page;

import java.util.UUID;

public interface ParkingSpotService {
    ParkingSpotDto add(ParkingSpotSaveDto dto);

    ParkingSpotDto updateById(UUID id, ParkingSpotSaveDto dto);

    void deleteById(UUID id);

    ParkingSpotDto getById(UUID id);

    Page<ParkingSpotDto> getAllParkingSpots();
}
