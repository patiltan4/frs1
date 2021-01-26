package com.company;

public class Flight {
    public String flightNumber;
    public String airline;
    public int capacity = 120;
    private int bookedSeats = 0;

    public Flight(String flightNumber, String airline) {
        this.flightNumber = flightNumber;
        this.airline = airline;
    }

    public String getFlightDetails(){

        return null;
    }
    public boolean checkAvailibilty(){
       if (bookedSeats > capacity){
           return false;
       }else {
           return true;
       }
    }
    public void incrementBookingCounter(){
      bookedSeats++;
    }
}
