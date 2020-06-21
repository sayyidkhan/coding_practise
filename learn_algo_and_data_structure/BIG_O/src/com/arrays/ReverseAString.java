package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAString {

    public static void main(String[] args) {
        String string = "Hi i am andrei";
//        splitString(string);
        System.out.println(reverseString(string));
    }


    private static String reverseString(String value){
        String[] stringArray = value.split("");
        ArrayList<String> finalArray = new ArrayList<>();

        for(int i = stringArray.length - 1;i >= 0;i--){
        finalArray.add(stringArray[i]);
        }

        return String.join("",finalArray);
    }

    private static void splitString(String value){
        String[] stringArray = value.split("");
        System.out.println(stringArray[0]);
    }


}
