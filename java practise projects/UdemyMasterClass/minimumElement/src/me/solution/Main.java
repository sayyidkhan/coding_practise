package me.solution;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
        // The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.

        // Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
        // In the main() method read the count from the console and call the method readIntegers() with the count parameter.
        // Then call the findMin() method passing the array returned from the call to the readIntegers() method.
        // Finally, print the minimum element in the array.

        // Tips:
        // Assume that the user will only enter numbers, never letters
        // For simplicity, create a Scanner as a static field to help with data input
        // Create a new console project with the name ÅeMinElementChallengeÅf


        int[] readArray = readIntegers(5);
        System.out.println("array details = " + Arrays.toString(readArray));
        System.out.println("min number = " + findMin(readArray));
    }

    public static int[] readIntegers(int count) {

        Scanner sc = new Scanner(System.in); // call for the scanner class
        int[] finalArray = new int[count]; // initalise an array to store all the values inside
        System.out.println("Enter integer into the system:");
        for(int i = 0; i < count; i++){
            System.out.println("no " + (i+1) + " of " + count);
            int currentNumber = sc.nextInt();
            finalArray[i] = currentNumber;
        }
        sc.close(); // turn off the scanner class
        return finalArray;

    }

    public static int findMin(int[] arrayOfInt) {

        int[] newArray; // create a new array of same length
        newArray = arrayOfInt.clone(); // clone the data from one into another

        int minNum = newArray[0];

        for(int i = 0;i < newArray.length;i++){
            if(newArray[i] < minNum){
                minNum = newArray[i];
            }
        }
        return minNum;

    }



}
