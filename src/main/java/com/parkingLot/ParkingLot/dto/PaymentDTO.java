package com.parkingLot.ParkingLot.dto;

import com.parkingLot.ParkingLot.entities.PaymentMode;

public class PaymentDTO {
    private TicketDTO ticketDTO;
    private PaymentMode mode;

    public TicketDTO getTicketDTO() {
        return ticketDTO;
    }

    public void setTicketDTO(TicketDTO ticketDTO) {
        this.ticketDTO = ticketDTO;
    }

    public PaymentMode getMode() {
        return mode;
    }

    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }
}
