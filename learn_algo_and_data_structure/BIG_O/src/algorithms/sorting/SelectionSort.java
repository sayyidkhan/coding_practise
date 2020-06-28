package algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] numbers = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        int[] numbersSorted = {0, 1, 2, 4, 5, 6, 44, 63, 87, 99, 283};

        andreiSelectionSort(numbers);
    }

    private static void andreiSelectionSort(int[] intArray){
        int maxCounter = 0;
        for(int i = 0;i < intArray.length;i++){
            //set the current index as minimum
            int lowestValue = i;

            for(int j = i + 1;j < intArray.length;j++){
                maxCounter++;

                if(intArray[j] < intArray[lowestValue]){
                    //update minimum if current is lower that what we had previously
                    lowestValue = j;
                }
            }

            int temp = intArray[i];
            intArray[i] = intArray[lowestValue];
            intArray[lowestValue] = temp;
        }

        System.out.println("max iterations: " + maxCounter);
        System.out.println(Arrays.toString(intArray));
    }

    private static void selectionSort(int[] intArray){
        int maxCounter = 0;
        int lowestValue;
        int currentSwapIndex = 0;
        boolean swapIsRequired = false;

        for(int j = 0;j < intArray.length;j++){
            lowestValue = intArray[j];
            for(int i = j;i < intArray.length;i++) {
                maxCounter++;

                int currentIteration = intArray[i];
                if(currentIteration < lowestValue){
                    lowestValue = currentIteration;
                    currentSwapIndex = i;
                    swapIsRequired = true;
                }
            }

            if(swapIsRequired){
                int temp = intArray[j];
                intArray[j] = lowestValue;
                intArray[currentSwapIndex] = temp;
                swapIsRequired = false;
            }

        }

        System.out.println("max iterations: " + maxCounter);
        System.out.println(Arrays.toString(intArray));
    }

}
