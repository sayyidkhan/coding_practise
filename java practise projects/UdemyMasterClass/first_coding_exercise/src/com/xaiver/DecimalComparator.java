package com.xaiver;
import java.text.DecimalFormat;

public class DecimalComparator {
    public static void main(String[] args) {

        boolean printData = areEqualByThreeDecimalPlaces(-3.1756,-3.175);
        boolean printData2 = areEqualByThreeDecimalPlaces(3.175, 3.176);
        boolean printData3 = areEqualByThreeDecimalPlaces(3.0, 3.0);
        boolean printData4 = areEqualByThreeDecimalPlaces(3.1756,3.175);
        System.out.println(printData);
        System.out.println(printData2);
        System.out.println(printData3);
        System.out.println(printData4);
    }

    public static boolean areEqualByThreeDecimalPlaces(double valueA,double valueB){
            if (valueA < 0){
                valueA = (Math.ceil(valueA * 1000) / 1000);
            }
            else{
                valueA = (Math.floor(valueA * 1000) / 1000);
            }

            if (valueB < 0){
                valueB = (Math.ceil(valueB * 1000) / 1000);
            }
            else{
                valueB = (Math.floor(valueB * 1000) / 1000);
            }

            boolean finaldata = (valueA == valueB) ? true : false;
            return finaldata;
    }

}
