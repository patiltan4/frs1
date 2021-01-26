package com.company;

public class Contact {
    public String name;
    public String phone;
    public String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getContactDetails(){
       Contact contact = new Contact(name,phone,email);
       return String.valueOf(contact);
    }
    public void updateContactDetails(String contactDetail){
       this.name = name;
       this.phone = phone;
       this.email = email;
    }
}
