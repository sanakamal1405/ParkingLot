package com.parkingLot.ParkingLot.entities;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class Receipt {

    private Timestamp outTime;
    private Payment payments;


}
