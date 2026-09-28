package com.parking.client.dto.vehicle;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class VehicleSaveDto {
    @NotBlank(message = "Гос номер не должен быть пустым")
    @Pattern(regexp = "^0[1-9][\\s-]?\\d{3}[\\s-]?[A-Z]{3}$\n")
    private String numberPlate;

    @NotBlank(message = "Модель машины не должна быть пустой")
    private String carModel;

    @NotNull(message = "Год выпуска машины не должен быть пустым")
    private int year;
}
