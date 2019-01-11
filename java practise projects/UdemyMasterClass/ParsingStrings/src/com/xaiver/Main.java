package com.xaiver;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String numberAsString = "2018";
        String numberAsStringDouble = "2018.133";
        System.out.println("numberAsString = " + numberAsString);

        // convert string to double
        System.out.print("Double as a datatype: ");
        convertString2Double(numberAsStringDouble);

        // convert string to number(integer)
        int number = Integer.parseInt(numberAsString);
        System.out.println("Number = " + number);

        number += 1; // will add the number up
        numberAsString += 1; // will concentate the strings



        System.out.println("numberAsString = " + numberAsString); // result 20181
        System.out.println("Number = " + number); // result 2019



    }

    public static void convertString2Double(String string) {
        double number = Double.parseDouble(string);
        System.out.println(number);
    }

}
