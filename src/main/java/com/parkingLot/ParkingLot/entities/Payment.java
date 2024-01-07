package com.parkingLot.ParkingLot.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Payment {
    private long transactionId;
    private Double amount;
    private PaymentMode mode;
}
