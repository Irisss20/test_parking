package com.parking.client.service;

import com.parking.client.dto.billing.BillingDto;
import com.parking.client.dto.billing.BillingResponseDto;
import com.parking.client.dto.billing.BillingSaveDto;
import com.parking.client.dto.billing.BillingShortDto;

import java.util.UUID;

public interface BillingService {
    BillingResponseDto checkForAvailableSpot(String plateNumber);

    BillingDto create(BillingSaveDto dto);

    void approveVehicleCheckIn(String plateNumber);

    BillingShortDto approveVehicleCheckOut(UUID id);
}
