package com.xaiver;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // 3rd way to init an array;
        int[] myIntArray = new int[25];
        for(int i = 0 ; i < myIntArray.length ; i++ ){
            myIntArray[i] = i * 10;
        }
        printArray(myIntArray);

        // 2nd way to init an array
//        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10}; // a shorthand method to fill the value into an array

        // 1st way to init an array
//        int[] myIntArray = new int[10]; // create an array with 10 slots available
//        myIntArray[5] = 50; // starts from the number 0 for the index 1



        // if 5 the on the index will be 6;

        double[] myDoubleArray = new double[10];
        System.out.println(myIntArray[5]);

    }

    public static void printArray(int[] array){
        for(int i = 0 ; i < array.length ; i++ ){
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

}
