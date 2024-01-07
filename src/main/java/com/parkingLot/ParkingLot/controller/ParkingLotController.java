package com.parkingLot.ParkingLot.controller;

import com.parkingLot.ParkingLot.dto.PaymentDTO;
import com.parkingLot.ParkingLot.dto.TicketDTO;
import com.parkingLot.ParkingLot.entities.Payment;
import com.parkingLot.ParkingLot.entities.Receipt;
import com.parkingLot.ParkingLot.entities.Ticket;
import com.parkingLot.ParkingLot.entities.VehicleType;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.parkingLot.ParkingLot.services.TicketService;

import javax.enterprise.inject.Produces;
import java.sql.Timestamp;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@RestController
public class ParkingLotController {

    @Autowired
    private TicketService ticketService;

    @PostMapping(value="/printTicket", produces="application/json", consumes = "application/json")
    public Ticket printTicket(@RequestBody TicketDTO req)
    {
        return ticketService.printTicket(req);
    }


    @PostMapping(value="/pay", produces="application/json", consumes = "application/json")
    public Receipt makePayment(@RequestBody PaymentDTO req) {

        Timestamp outTimestamp = new Timestamp(System.currentTimeMillis());
        Long totalTime = outTimestamp.getTime() - req.getTicketDTO().getInTime().getTime();
        Double money;

        //This can be better implemented using Strategy Pattern with pay interface
        if (req.getTicketDTO().getVehicle().getVehicleType() == VehicleType.TWO_WHEELER) {
            money = totalTime.doubleValue() * 2.0d;

        } else{
            money= totalTime.doubleValue()*4.0d;
    }


        Payment p= Payment.builder()
                .amount(money)
                .mode(req.getMode())
                .transactionId((long)(Math.random() * (100000 - 99999 + 1) + 99999  ))
                .build();

        return Receipt.builder()
            .payments(p)
            .outTime(outTimestamp)
            .build();
    }


}
