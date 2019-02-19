package com.mine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.Scanner;  // Import the Scanner class

public class Main {

    public static void main(String[] args) {


        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.

        // Implement the following methods - getIntegers, printArray, and sortIntegers

        // getIntegers returns an array of entered integers from keyboard

        // printArray prints out the contents of the array

        // and sortIntegers should sort the array and return a new array containing the sorted numbers

        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.


        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println(" Enter how many numbers you would like to enter into the array: ");
        int lengthOfArrayList = myObj.nextInt();
        myObj.nextLine(); // catch enter statement


        ArrayList<Integer> finalArray = new ArrayList<>(); // create a new array


        for( int i = 0; i < lengthOfArrayList; i++ ) {
            System.out.println("enter the " + (i+1) + " of " + lengthOfArrayList + "numbers to be entered into an array ." );
            int arrayData = myObj.nextInt();
            getIntegerValue(arrayData);
            myObj.nextLine(); // catch enter statement
            finalArray.add(arrayData);
        }

        getArrayListValue(finalArray);
        System.out.println(sortIntegers(finalArray));
        getArrayListValue(finalArray);

    }


    public static void getIntegerValue(int number){
        System.out.println(number);
    }


    // get the arrayListValue
    public static void getArrayListValue(ArrayList arrayList) {
        System.out.println(arrayList);
    }


    public static ArrayList sortIntegers(ArrayList arrayList) {

        ArrayList<Integer> finalArray = (ArrayList) arrayList.clone();
        Collections.sort(finalArray, Collections.reverseOrder());
        return finalArray;

    }




}
