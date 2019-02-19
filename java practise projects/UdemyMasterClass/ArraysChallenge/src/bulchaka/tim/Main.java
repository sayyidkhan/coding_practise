package bulchaka.tim;
import java.util.Scanner;


public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);

    }

    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for(int i =0; i < array.length;i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i <array.length;i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static void sortIntgers(int[] array) {
        int[] sortedArray = new int[array.length];
        for(int i = 0;i < array.length; i++){
            sortedArray[i] = array[i];
        }

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int j = 0;j < sortedArray.length -1 ; j++){
                if(sortedArray[j] < sortedArray[j + 1]){

                }
            }
        }
        //
    }


}
