package com.company;

public class Main_2 {
    public static void main(String[] args) {
        //////// primitive data types /////////
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        //////// primitive data types /////////
        // string contains a sequence of character

        String myString = "This is a String";
        System.out.println("MyString is equal to " + myString);
        myString = myString + ", and this is more";
        System.out.println("MyString is equal to " + myString);
        myString = myString + '\u00a9' + " 2015";
        System.out.println("MyString is equal to " + myString);

        String lastString =  "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to" + lastString);

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to" + lastString);

    }
}
