public class Variable {

    public static void main(String[] args) {
        System.out.println("Learning About Variables");

        // assign a new variable
        int  myFirstNumber = 10; // "int" is for integer for storing whole numbers
        int  mySecondNumber = (10 + 5) + (2 * 10); // we can do Arithmetic in java
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber; // we can add int variables together

        int myLastOne = 1000 - myTotal;

        System.out.println("int : " + mySecondNumber);
        System.out.println("myTotal : " + myTotal);
        System.out.println("MyLastOne : " + myLastOne);

    }

}
