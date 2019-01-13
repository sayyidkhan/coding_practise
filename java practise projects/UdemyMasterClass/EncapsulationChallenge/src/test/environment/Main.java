package test.environment;

public class Main {

    public static void main(String[] args) {

        double mathRandom = Math.random();
        double roundOff = (double) Math.round(mathRandom * 100) / 100;
        int finalValue = (int) (roundOff * 10);
        System.out.println(finalValue);

    }

}
