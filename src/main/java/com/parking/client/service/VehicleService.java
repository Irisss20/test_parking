package com.parking.client.service;

import com.parking.client.dto.vehicle.VehicleDto;
import com.parking.client.dto.vehicle.VehicleSaveDto;
import org.springframework.data.domain.Page;

import java.util.UUID;

public interface VehicleService {
    VehicleDto add(VehicleSaveDto dto);

    VehicleDto updateById(UUID id, VehicleSaveDto dto);

    void deleteById(UUID id);

    VehicleDto getById(UUID id);

    Page<VehicleDto> getAllVehicles();
}
