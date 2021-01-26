package com.company;

public class Address {
    public String street;
    public String city;
    public String state;

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String getAddressDetails(){


        Address address = new Address(street,city,state);
        return String.valueOf(address);
    }

    public void updateAddressDetails(String addressDetails){
       this.street = street;
       this.city = city;
       this.state = state;
    }

}
