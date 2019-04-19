package packageChallenge.me;

public class Series {

    public static int nSum(int num){
        // alternative solution (n + 1) * (n/2) + n
        if(num == 0 || num == 1){
            return num;
        }
        else {
            return (int) ((num / 2) + (Math.pow(num, 2) / 2));
        }
    }

    public static int factorial(int num){
        if(num == 1 || num == 0){
            return 1;
        }
        else{
            return num * factorial(num - 1);
        }
    }

    public static int fibonacci(int n)  {
        if (n < 2) return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }




}
