package com.xaiver;

import java.util.ArrayList;


public class Contact {

    private String name;
    private int phoneNumber;

    public Contact(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public boolean queryName(String queryname, ArrayList listItems){
        for(int i = 0; i < listItems.size(); i++ ) {
            if(queryname == listItems.get(i)){
                return true;
            }
        }
        return false;
    }

    private String getName() {
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
