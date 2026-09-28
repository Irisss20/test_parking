package com.parking.client.dto.billing;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class BillingShortDto {
    private Timestamp checkedIn;

    private Timestamp checkedOut;
}
