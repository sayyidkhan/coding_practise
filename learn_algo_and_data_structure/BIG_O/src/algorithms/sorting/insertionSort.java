package algorithms.sorting;

import java.util.Arrays;

public class insertionSort {

    public static void main(String[] args) {
        int[] numbers = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

        insertionSort(numbers);
    }

    public static void insertionSort(int[] intArray){
        //iterate through the loop
        for(int i = 0;i < intArray.length;i++){
            //get the current element
            int currentElement = intArray[i];
            int previousElement = i - 1;

            while (previousElement >= 0 && intArray[previousElement] > currentElement) {
                //move the item up, when a is greater than b
                intArray[previousElement + 1] = intArray[previousElement];
                previousElement--;
            }
            intArray[previousElement + 1] = currentElement;
        }


        System.out.println(Arrays.toString(intArray));
    }

}

