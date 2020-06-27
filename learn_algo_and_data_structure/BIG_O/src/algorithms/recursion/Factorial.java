package algorithms.recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorialRecursion(5));
    }

    public static int factorialRecursion(int number){
        int sum = 1;
        if(number >= 1){
            sum = number * factorialRecursion(number - 1);
        }
        return sum;
    }

    public static int factorialIterative(int number){
        int sum = 1;
        while (number > 0){
            sum *= number;
            number--;
        }
        return sum;
    }

}
