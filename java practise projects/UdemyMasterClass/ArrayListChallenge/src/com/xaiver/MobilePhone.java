package com.xaiver;

import java.util.ArrayList;

public class MobilePhone {

    // to store mobile phone options
    private ArrayList<Contact> contactList;

    public MobilePhone() {
        ArrayList<Contact> contactList = new ArrayList<Contact>();
        this.contactList = contactList;
    }

    private int contactListLength() {
        return this.contactList.size();
    }

    public void store(String contactName,int contactNumber){
        if(contactListLength() <= 0) {
            this.contactList.add(new Contact(contactName, contactNumber));
            System.out.println("Contact Name " + contactName + " & " + contactNumber + "have been added");
        }
    }





}
