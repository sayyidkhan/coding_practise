package algorithms.sorting;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {
        int[] numbers = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        int[] numbers2 = {99, 44, 6,33};

        bubbleSortAndrei(numbers2);
    }

    public static void bubbleSortAndrei(int[] intArray){
        int maxCounter = 0;
        int arrayLength = intArray.length;
        for(int i = 0;i < arrayLength - 1;i++){
            for(int j = 0;j < arrayLength - 1;j++){
                maxCounter++;

                int num1 = intArray[j];
                int num2 = intArray[j+1];
                if(num1 > num2){
                    //swap numbers
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
            }
        }

        System.out.println("max iterations: " + maxCounter);
        System.out.println(Arrays.asList(intArray));
    }


}
