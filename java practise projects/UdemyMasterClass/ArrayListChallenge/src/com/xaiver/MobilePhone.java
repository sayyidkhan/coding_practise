package com.xaiver;

import java.util.ArrayList;
import java.util.Scanner;

class MobilePhone {

    // to store mobile phone options
    private ArrayList<Contact> contactList;

    MobilePhone() {
        ArrayList<Contact> contactList = new ArrayList<Contact>();
        this.contactList = contactList;
        this.contactList.add(new Contact("apple",8765432));
    }

    // does validation to check whether contact exists
    private boolean queryNameValidation(String contactName){
        return Contact.queryName(contactName,this.contactList);
    }

    private void store(String contactName,int contactNumber){
        if(queryNameValidation(contactName)){
            // if return true, means does not contain contactName, accept
            // if false, means contactName exists, reject

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

    private void searchContacts(String contactName){
        Contact.printContact(contactName,this.contactList);
    }

    private void remove(String contactName){
        if(!queryNameValidation(contactName)){
            // if return true, does not have contactName, we want to reject
            // if return false, means contact contains, we want to accept
            int positionToRemoveNumber = Contact.validateObjectArrayIndex(contactName,this.contactList);
            this.contactList.remove(positionToRemoveNumber);
            System.out.println("Contact " + contactName + " have been removed.");
        }
        else{
            System.out.println("Contact does not exist, unable to remove.");
        }
    }

    private void modify(String contactName,String newContactName){
        // print out existing info, before changing the state
        if(queryNameValidation(contactName)){
            // if name does not exist, end method
            System.out.println("Contact Name " + contactName  + " does not exist");
        }
        else{
            // if name exists, continue method
            Contact.modifyObjectData(contactName,newContactName,this.contactList);
        }
    }

    private void modify(String contactName,int newContactNumber){
        // print out existing info, before changing the state
        if(queryNameValidation(contactName)){
            // if name does not exist, end method
            System.out.println("Contact Name " + contactName  + " does not exist");
        }
        else{
            // if name exists, continue method
            Contact.modifyObjectData(contactName,newContactNumber,this.contactList);
        }
    }

    private void modifyMenu(){
        System.out.println("############################");
        System.out.println("1. Modify the contact name");
        System.out.println("2. Modify the contact number");
        System.out.println("############################");
    }

    private void modify(){
        int modifyMenuOptions = 1; // init a number to let the default menu run, number can be anything
        Scanner readModifyMenuOptions = new Scanner(System.in);
        Scanner readModifyMenuDetails = new Scanner(System.in);
        while(modifyMenuOptions != 0) {
            modifyMenu();
            System.out.println("Enter an option: ");
            modifyMenuOptions = readModifyMenuOptions.nextInt();
            readModifyMenuOptions.nextLine(); // catch enter statement, escaped characters
            switch (modifyMenuOptions){
                case 1:
                    System.out.println("1. Modify the contact name");
                    System.out.println("Enter an existing contact name: ");
                    String existingContactName = readModifyMenuDetails.nextLine();
                    System.out.println("Enter a new contact name: ");
                    String newContactName = readModifyMenuDetails.nextLine();
                    modify(existingContactName,newContactName); // change the contact name details
                    modifyMenuOptions = 0; // stop the loop
                    break;
                case 2:
                    System.out.println("2. Modify the contact number");
                    System.out.println("Enter an existing contact Name: ");
                    String contactName = readModifyMenuDetails.nextLine();
                    System.out.println("Enter a new contact number: ");
                    int newContactNumber = readModifyMenuDetails.nextInt();
                    modify(contactName,newContactNumber); // change the mobile number details
                    modifyMenuOptions = 0; // stop the loop
                    break;
                default:
                    System.out.println("--- invalid option ---");
            }
        }
    }

    private void showAllContacts(){
        if(this.contactList.size() == 0){
            System.out.println();
            System.out.println("--- no contacts in the contact book ---");
            System.out.println();
        }
        else{
            Contact.showAllContacts(this.contactList);
        }
    }

    private static void printMenuItems(){
        System.out.println("######################################");
        System.out.println("--- Mobile Main Menu ---");
        System.out.println("1. Add New Contacts ");
        System.out.println("2. Modify an existing contacts");
        System.out.println("3. Remove an existing Contact");
        System.out.println("4. Search for an existing contact name");
        System.out.println("5. Show all contacts in the phone book");
        System.out.println("0. exit the program");
        System.out.println("######################################");
    }

    void menu(){
        Scanner readMenuOptions = new Scanner(System.in);
        Scanner readMenuDetails = new Scanner(System.in);
        int optionsMenu = 1; // init a number to let the default menu run, number can be anything

        while(optionsMenu != 0) {
            printMenuItems();
            System.out.println("Enter an option: ");
            optionsMenu = readMenuOptions.nextInt();
            readMenuOptions.nextLine(); // catch enter statement, escaped characters
            switch (optionsMenu) {
                // add new contacts
                case 1:
                    System.out.println("1. Add New Contacts ");
                    ////////////////////// store contacts //////////////////////////
                    System.out.println("Enter a new contact Name: ");
                    String contactName = readMenuDetails.nextLine();
                    System.out.println("Enter a new 8 digits contact Number: ");
                    int contactNumber = readMenuDetails.nextInt();
                    readMenuDetails.nextLine(); // catch enter statement, escaped characters
                    store(contactName,contactNumber); // add new contact
                    ////////////////////// store contacts //////////////////////////
                    continue;
                case 2:
                    System.out.println("2. Modify an existing contacts");
                    ////////////////////// modify contacts //////////////////////////
                    modify();
                    ////////////////////// modify contacts //////////////////////////
                    continue;
                case 3:
                    System.out.println("3. Remove an existing Contact");
                    ////////////////////// remove contacts //////////////////////////
                    System.out.println("Enter an contact name to delete: ");
                    String existingContactName = readMenuDetails.nextLine();
                    remove(existingContactName);
                    ////////////////////// remove contacts //////////////////////////
                    continue;
                case 4:
                    System.out.println("4. Search for an existing contact name");
                    ////////////////////// search contacts //////////////////////////
                    System.out.println("Enter an existing contact Name to be searched: ");
                    String searchContactName = readMenuDetails.nextLine();
                    searchContacts(searchContactName);
                    ////////////////////// search contacts //////////////////////////
                    continue;
                case 5:
                    System.out.println("5. Show all contacts in the phone book");
                    ////////////////////// show all contacts ////////////////////////
                    showAllContacts();
                    ////////////////////// show all contacts ////////////////////////
                    continue;
                default:
                    System.out.println("--- invalid option ---");
                    continue;
                case 0:
                    System.out.println("--- Program End ---");
                    break;
            }
        }
    }

}
