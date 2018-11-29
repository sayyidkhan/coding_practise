package com.company;

public class Main_2 {

    public static void main(String[] args){

        // 1. Create a byte variable and set it to any valid byte number.
        // 2. Create a short variable and set it to any valid short number.
        // 3. create a int variable and set it to any valid int number.
        // 4. create a variable of type long, and make it equal to
        // 50000 + 10 times the sum of the byte, put the short plus the int


        // DataType: byte have a width of 8
        byte myByte = 10; //qn. 1
        // DataType: short have a width of 16
        short myShort = 20;
        // DataType: int have a width of 32
        int myInt = 32;
        // DataType: Long have a width of 64
        long myLong = (50_000 + 10) * (myByte + myShort + myInt);
        // for variable type long or int casting is not required

        System.out.println(myLong);

    }



}
