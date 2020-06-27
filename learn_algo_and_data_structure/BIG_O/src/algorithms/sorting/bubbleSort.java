package algorithms.sorting;

import java.util.Arrays;
import java.util.stream.Stream;

public class bubbleSort {

    public static void main(String[] args) {
        int[] numbers = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        int[] numbers2 = {99, 44, 6,33};

        bubbleSort(numbers);
    }

    public static void bubbleSort(int[] intArray){
        int maxCounter = 0;
        int counter = 0;
        for(int i = 0;i < intArray.length - 1;i++){
            maxCounter++;
            //perform the sort
            int num1 = intArray[i];
            int num2 = intArray[i + 1];
            if(num1 > num2){
                intArray[i] = num2;
                intArray[i + 1] = num1;
                counter++;
            }

            if(i == intArray.length - 2 && counter > 0){
                i = -1;
                counter = 0;
            }
        }

        System.out.println("max iterations: " + maxCounter);
        System.out.println(Arrays.toString(intArray));
    }

}
