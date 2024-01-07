package com.parkingLot.ParkingLot.entities;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class Ticket {
    private Timestamp inTime;
    private Vehicle vehicle;

}