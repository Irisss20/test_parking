package com.parking.client.dto.parking.spot;

import com.parking.client.enums.ParkingSpotStatus;
import com.parking.client.enums.VehicleType;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ParkingSpotSaveDto {
    @NotNull(message = "Номер этажа обязателен")
    @Min(value = -5, message = "Этаж не может быть ниже -5")
    @Max(value = -1, message = "Этаж не может быть выше -1")
    private int floorNumber;

    @NotNull(message = "Тип транспортного средства обязателен")
    private VehicleType vehicleType;

    @NotNull(message = "Статус парковочного места обязателен")
    private ParkingSpotStatus status;
}
