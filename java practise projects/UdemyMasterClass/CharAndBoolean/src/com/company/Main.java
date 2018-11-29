package com.company;

public class Main {

    public static void main(String[] args) {
	// store Char, width of 16, 2 bytes
        char myChar = '\u00A9'; // copyright logo
        System.out.println("Unicode output was : " + myChar);

        boolean myBoolean = false;
        boolean isMale = true; // boolean can only enter only either true or false

        // 1. find the code for the registered symbol on the same line as the copyright symbol
        // 2. Create a variable of type char and assign it to the unicode value for that symbol
        // 3. Display it on screen

        char myRegistered = '\u00AE'; // registered logo
        System.out.println("Registered Logo : " + myRegistered);
    }
}
