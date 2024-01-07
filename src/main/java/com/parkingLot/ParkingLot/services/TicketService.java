package com.parkingLot.ParkingLot.services;

import com.parkingLot.ParkingLot.dto.TicketDTO;
import com.parkingLot.ParkingLot.entities.Ticket;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    public Ticket printTicket(TicketDTO req)
    {
        return Ticket.builder()
                .vehicle(req.getVehicle())
                .inTime(req.getInTime())
                .build();
    }
}
