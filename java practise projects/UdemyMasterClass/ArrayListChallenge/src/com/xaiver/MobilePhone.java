package com.xaiver;

import java.util.ArrayList;

public class MobilePhone {

    // to store mobile phone options
    private ArrayList<Contact> contactList;

    public MobilePhone() {
        ArrayList<Contact> contactList = new ArrayList<Contact>();
        this.contactList = contactList;
        this.contactList.add(new Contact("apple",8765432));
    }

    public int contactListLength() {
        return this.contactList.size();

    }

    // does validation to check whether contact exists
    private boolean queryNameValidation(String contactName){
        if(Contact.queryName(contactName,this.contactList)){
            return true;
        }
        return false;
    }

    //write function queryReturnObject when validation successful

    public void store(String contactName,int contactNumber){
        if(queryNameValidation(contactName)){
            // if return true, means does not contain, accept
            // if false, means does not contain, reject

            // add a new contract into the person mobile phone
            this.contactList.add(new Contact(contactName, contactNumber));
            // prints out the success details
            System.out.println("Contact Name " + contactName + " & " + contactNumber + " have been added");

        }
        else{
            // prints out the fail to add into the contact book details
            System.out.println("Contact Book alreadly contains " + contactName + " in the contact book");
        }
    }

    // use the queryReturnObject to return the value
    public void searchContactName(){

    }


}
