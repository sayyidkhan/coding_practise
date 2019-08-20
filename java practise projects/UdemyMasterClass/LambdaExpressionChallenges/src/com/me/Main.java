package com.me;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        // challenge 1
//        Runnable task = () -> {
//            String myString = "Let's split this up into an array";
//            String[] parts = myString.split(" ");
//            for(String part:parts){
//                System.out.println(part);
//            }
//        };

        // challenge 3 - quiz
        Function<String,String> lambdaFunction = s -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                if(i % 2 == 1){
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };
        // challenge 3 - ans
        System.out.println(lambdaFunction.apply("1234567890"));

        // challenge 4 - solution
        System.out.println(everySecondChar("1234567890"));

        System.out.println("#######################");

        // challenge 5 - ans
        String result = everySecondChar(lambdaFunction,"1234567890");
        System.out.println(result);

        System.out.println();

        // challenge 6 - ans
        Supplier<String> iLoveJava = () -> "I love Java!";

        // challenge 7 - ans
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

    }

    // challenge 2 - quiz
    public static String everySecondChar(String source){
        StringBuilder returnVal = new StringBuilder();
        for(int i = 0; i < source.length(); i++){
            if(i % 2 == 1){
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }

    // challenge 2 - solution
    public static String everySecondChar_Lambda(String source){
        List<String> myList = Arrays.asList(source.split(","));
        StringBuilder sb = new StringBuilder();
        myList.forEach(sb::append);
        return sb.toString();
    }

    // challenge 4 - quiz
    public static String everySecondCharacter(String source){
        Function<String,String> lambdaFunction = s -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                if(i % 2 == 1){
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        return (lambdaFunction.apply(source));
    }

    // challenge 5 - quiz
    public static String everySecondChar(Function<String,String> func,String source){
        return func.apply(source);
    }




}
