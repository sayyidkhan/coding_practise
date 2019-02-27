package com.xaiver;

import java.util.ArrayList;


public class Contact {

    private String name;
    private int phoneNumber;

    public Contact(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public static boolean queryName(String queryname,ArrayList<Contact> contactListArray){
        for(int i = 0; i < contactListArray.size(); i++ ) {
            String currentName = contactListArray.get(i).getName();
            if(queryname == currentName){
                return !true;
            }
        }
        return !false;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getPhoneNumber() {
        return phoneNumber;
    }

    private void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
