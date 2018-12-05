package com.xaiver;

public class Feet2Centi {

    // create a method called calcFeetAndInchesToCentimeters
    // it needs to have two parameters
    // feet is the first parameter, inches is the 2nd parameter
    //
    // you should validate that the first parameter feet is >= 0
    // you should validate that the 2nd parameter inches is >= 0 and <= 12
    // return -1 from the method if etiher of the above is not true
    //
    // if the parameters are valid, then calculate how many centimeters
    // compromise the fets and inches passed to this method and return that value
    //
    // create 2nd method of the same name but only one parameter
    // inches is the parameter
    // validate that its >= 0
    // return - 1 if it is not true
    // but if its valid, then calculate how many feet are in the inches
    // and then here is the tricky part
    // call other overloaded method passing the correct feet and inches
    // calculated so that it can calculate correctly
    // hints: use double for your number datatypes is a good idea
    // 1 inch = 2.54cm and one foot = 12 inches
    // use the link i give u to confirm your code is calculating correctly
    // calling another overloaded method just requires you to use the right
    // number of parameters

    public static void main(String[] args) {
    calcFeetAndInchesToCentimeters(6,0); // using the first parameter
        calcFeetAndInchesToCentimeters(100);
    }
    /*
    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if (feet >= 0 && (inches >= 0 && inches <= 12)){
            double sum = calcFeetAndInchesToCentimeters(feet * 12) + calcFeetAndInchesToCentimeters(inches);
            System.out.println( feet + "Feet + " + inches + "inches" + " = " + sum + "CM");
            return sum;
        }
        System.out.println("invalid feet and inches");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        if ((inches >= 0)){
            double cm = inches * 2.54;
            return cm;
        }
        return -1;
    }
    */

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet >= 0 && (inches >= 0 && inches <= 12)){
        double cm = (feet * 12) * 2.54;
        cm = cm + inches * 2.54;
        System.out.println("\t");
        System.out.println( feet + " Feet + " + inches + " inches" + " = " + cm + " CM");
        return cm;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0){
        double feet = (int) inches / 12;
        double remainder = inches % 12;
        System.out.println(inches + "inches is equal to " + feet + " Feet and " + remainder + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainder);
        }
        return -1;
    }

}
