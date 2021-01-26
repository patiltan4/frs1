package com.company;

public class Ticket {
    public String pnr;
    public String seatNo;
    public String from;
    public String to;
    public Flight flight;
    public float price;
    public boolean cancelled;
    public String arrivalDateTime;
    public String departureDateTime;
    public Passenger passenger;

    public Ticket(String pnr, String seatNo, String from, String to, Flight flight, float price, boolean cancelled, String arrivalDateTime, String departureDateTime, Passenger passenger) {
        this.pnr = pnr;
        this.seatNo = seatNo;
        this.from = from;
        this.to = to;
        this.flight = flight;
        this.price = price;
        this.cancelled = cancelled;
        this.arrivalDateTime = arrivalDateTime;
        this.departureDateTime = departureDateTime;
        this.passenger = passenger;
    }

    public String checkStatus(){

        return null;
    }
    public int getFlightDuration(){

        return 0;
    }
    public void cancel(){
     this.cancelled = true;
    }
}
