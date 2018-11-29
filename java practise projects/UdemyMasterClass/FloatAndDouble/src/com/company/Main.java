package com.company;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        // width of int = 32 (4 bytes)
        // width of float = 32 (4 bytes)
        // width of double = 64 (8 bytes)
        // double is faster on modern computers


        int myIntValue = 2; // no remainder is handled in this case
        float myFloatValue = (float) (5); // float "casting" must be done
        float myFloatValue_2 = 5f / 3f; // f at the end for the shorthand method
        // a float have 7 decimal point of precision
        double myDoubleValue = 5d / 3d; // because decimal value is to by default will convert into a double
        // a float have 16 decimal point of precision

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue_2);
        System.out.println("myDoubleValue = " + myDoubleValue);


        // convert a given number of pounds to kilograms
        // 1. create a variable to store the number of pounds
        // 2. calculate the number of kilograms for the number above and store in a variable
        // 3. print out the result

        // Notes: 1 pound is equal to 0.45359237 kilograms

        float storePound = 200f; // store the number of pounds
        double convertKilo = storePound * 0.45359237;

        // round up to 2 decimal point
        DecimalFormat df = new DecimalFormat("#.000"); // to 2 decimal points
        double convertKilo_df = Double.parseDouble(df.format(convertKilo));

        System.out.println("Convert pound to kilo : " + convertKilo_df); // returns 4.53
    }
}
