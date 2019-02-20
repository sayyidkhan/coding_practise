package bulchaka.tim;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5); // call for the array
        int[] sorted = sortIntgers(myIntegers);
        printArray(sorted);

        System.out.println("#################################");

        int[] sorted2 = copyArray(sorted);
        printArray(sorted2);

    }

    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity]; // create a new array based on the size of the integer
        System.out.println("Enter " + capacity + " integer values:\r");
        for(int i =0; i < array.length;i++) {
            array[i] = scanner.nextInt(); // input integer on every loop
        }
        return array; // returns an int array
    }

    public static void printArray(int[] array) {
        for(int i = 0; i <array.length;i++){
            System.out.println("Element " + i + " contents " + array[i]);
            // runs a for loop to return the contents of the array
        }
    }

    public static int[] sortIntgers(int[] array) {
        // initalize a new array based on the array length of the previous array
        int[] sortedArray = new int[array.length];
        for(int i = 0;i < array.length; i++){
            // put all the existing array and make a copy into the new array
            sortedArray[i] = array[i];
        }

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int j = 0;j < (sortedArray.length -1) ; j++){
                if(sortedArray[j] < sortedArray[j + 1]){
                    temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j+1];
                    sortedArray[j+1] = temp;
                    flag = true;
                }
            }

        }
        return sortedArray;
    }


    public static int[] copyArray(int[] array){
        int[] sortedArray = Arrays.copyOf(array,array.length);
        sortedArray[4] = 50;
        return sortedArray;
    }


}
