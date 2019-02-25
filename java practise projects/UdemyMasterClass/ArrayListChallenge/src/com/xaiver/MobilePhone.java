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

    public void store(String contactName,int contactNumber){
        if(queryName(contactName,this.contactList) == false){
            // if return true, means contains, reject
            // if false, only allow to add
            this.contactList.add(new Contact(contactName, contactNumber));
            System.out.println("Contact Name " + contactName + " & " + contactNumber + "have been added");
        }
        else{
            System.out.println("Contact Book alreadly contains " + contactName);
        }
    }

    public boolean queryName(String queryname, ArrayList listItems){
        for(int i = 0; i < listItems.size(); i++ ) {
            if(queryname == listItems.get(i)){
                return true;
            }
        }
        return false;
    }





}
