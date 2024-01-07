package com.parkingLot.ParkingLot.dto;

import com.parkingLot.ParkingLot.entities.Vehicle;

import java.sql.Timestamp;

public class TicketDTO {
    private Timestamp inTime;
    private Vehicle vehicle;

    public Timestamp getInTime() {
        return inTime;
    }

    public void setInTime(Timestamp inTime) {
        this.inTime = inTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}

