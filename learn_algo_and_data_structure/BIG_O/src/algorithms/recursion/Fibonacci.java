package algorithms.recursion;

public class Fibonacci {

    //fibonacci sequence
    // 0,1,1,2,3,5,8,13,21,34,55
    //the pattern of the sequence is that each value is the sum of the 2 previous values,
    // N = 5 = 2+3

    public static void main(String[] args) {
        int fib = fibonacciIterative(0);
        System.out.println(fib);
    }

    public static int fibonacciIterative(int index) {
        if(index < 2){
            return index;
        }
        else{
            int num1 = 0;
            int num2 = 1;
            int currentIndex = num1 + num2;
            for(int i = 2;i < index + 1;i++){
                currentIndex = num1 + num2;
                num1 = num2;
                num2 = currentIndex;
            }
            return currentIndex;
        }
    }

    public static int fibonacciRecursive(int index) {
        if(index < 2){
            //if the index is less than 2, return the index
            return index;
        }
        else{
            return fibonacciRecursive(index - 1) + fibonacciRecursive(index - 2);
        }

    }

}
