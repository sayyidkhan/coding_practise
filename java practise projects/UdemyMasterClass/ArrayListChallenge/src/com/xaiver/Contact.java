package com.xaiver;

import java.util.ArrayList;


public class Contact {

    private String name;
    private int phoneNumber;

    public Contact(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public static int validateObjectArrayIndex(String queryname,ArrayList<Contact> contactListArray){
        for(int i = 0; i < contactListArray.size(); i++ ) {
            String currentName = contactListArray.get(i).getName();
            if(queryname.equals(currentName)){
                return i;
            }
        }
        return -1;
    }

    public static boolean queryName(String queryname,ArrayList<Contact> contactListArray){
        int state = validateObjectArrayIndex(queryname,contactListArray);
        if(state >= 0){
            return !true;
        }
            return !false;
    }

    public static void modifyContact(){

    }

    public static void printContact(String queryname,ArrayList<Contact> contactListArray){
        int state = validateObjectArrayIndex(queryname,contactListArray);
        if(state >= 0) {
            System.out.println("Contact found.");
            System.out.println("Contact Name: " + queryname);
            System.out.println("Contact Number: " + contactListArray.get(state).getPhoneNumber());
        }
        else {
            System.out.println("Unable to find " + queryname + " in the contact book.");
        }
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
