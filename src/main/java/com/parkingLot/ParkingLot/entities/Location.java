package com.parkingLot.ParkingLot.entities;

public class Location {

    private  int floor;
    private VehicleType type;

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }
}
