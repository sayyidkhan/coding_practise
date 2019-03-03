package com.xaiver;

import java.util.ArrayList;


 class Contact {

    private String name;
    private int phoneNumber;

    Contact(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // method overloading with contactName
    static void modifyObjectData(String existingContactName,String newContactName,ArrayList<Contact> contactListArray){
        Contact contactObject = accessObject(existingContactName,contactListArray); // access the object via a method
        contactObject.setName(newContactName); // change the object via the setName
        System.out.println("Contact name have been been changed ");
        System.out.println("from: " + existingContactName);
        System.out.println("to: " + contactObject.getName());
    }

    // method overloading with contactNumber
    static void modifyObjectData(String contactName,int newContactNumber,ArrayList<Contact> contactListArray){
        Contact contactObject = accessObject(contactName,contactListArray); // access the object via a method
        int currentContactNumber = contactObject.getPhoneNumber();
        contactObject.setPhoneNumber(newContactNumber); // change the object via the setName
        System.out.println("Contact number have been been changed from: " + currentContactNumber +  " to : " + contactObject.getPhoneNumber());
    }

    private static Contact accessObject(String contactName,ArrayList<Contact> contactListArray){
        int positionToChangeNumber = validateObjectArrayIndex(contactName,contactListArray);
        return contactListArray.get(positionToChangeNumber); // return the individual contact object
    }

    static int validateObjectArrayIndex(String queryName,ArrayList<Contact> contactListArray){
        for(int i = 0; i < contactListArray.size(); i++ ) {
            String currentName = contactListArray.get(i).getName();
            if(queryName.equals(currentName)){
                return i;
            }
        }
        return -1;
    }

    static boolean queryName(String queryname,ArrayList<Contact> contactListArray){
        int state = validateObjectArrayIndex(queryname,contactListArray);
        return (state < 0);
    }

    static void printContact(String queryname,ArrayList<Contact> contactListArray){
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

    static void showAllContacts(ArrayList<Contact> contactListArray){
        for(int i = 0;i < contactListArray.size();i++){
            System.out.println();
            System.out.println("------- " + (i+1) + " of " +  contactListArray.size() + " -------");
            System.out.println("Contact Name: " + contactListArray.get(i).getName());
            System.out.println("Contact Number: " + contactListArray.get(i).getPhoneNumber());
            System.out.println();
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
