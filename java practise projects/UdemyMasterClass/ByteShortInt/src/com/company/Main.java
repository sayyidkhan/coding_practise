package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // DataType: integer, int have a width of 32
        // usually using integer by default
        int myMinValue = -2_147_483_648; // to store whole numbers
        int myMaxValue = 2_147_483_647; // we can use underscore to make the number more readable
        int myTotal = (myMinValue/2);

        // DataType: byte, byte has a width of 8
        byte maxByteValue = 127; // min byte value
        byte minByteValue = -128; // max byte value
        byte myNewByteValue = (byte) (maxByteValue/2); // when you type of expression, java converts it to an integer
        System.out.println("myNewByteValue = " + myNewByteValue);

        // DataType: short, short has a width of 16
        short minShortValue = -32768; // min short value
        short maxShortValue = 32767; // max short value
        short myNewShortValue = (short) (maxShortValue/2);

        // DataType: long, short has a width of 64
        long minLongValue = -9_223_372_036_854_775_807L; // min short value
        long maxLongValue = 32767; // max short value

    }
}
