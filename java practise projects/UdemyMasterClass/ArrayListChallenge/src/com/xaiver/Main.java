package com.xaiver;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Create a program that implements a simple mobile phone with the following capabilities.

        // Able to
        // 1. store,
        // 2. modify,
        // 3. remove
        // 4. query contact names.

        // You will want to create a separate class for
        // 1. Contact, (name & phone number)

        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.

        // Add a menu of options that are available.
        // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.

        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. no ints, no .get(i) etc

        // MobilePhone should do everything with Contact objects only.


        MobilePhone myMobile = new MobilePhone();
        myMobile.menu();

    }


}
