package arrays.exercise_2;

public class AnotherFunChallenge {

    public static void main(String[] args) {

    }

    private static void anotherFunChallenge(int input) {
        int a = 5; // O(1) -> constant time
        int b = 10; // O(1)
        int c = 50;  // O(1)
        for (int i = 0; i < input; i++) {  // O(input) -> O(n)
            int x = i + 1; // O(n)
            int y = i + 2; // O(n)
            int z = i + 3; // O(n)

        }
        for (int j = 0; j < input; j++) { // O(n)
            int p = j * 2; // O(n)
            int q = j * 2; // O(n)
        }
        String whoAmI = "I don't know"; // O(1)
    }

    /* sum of all the steps:
    BIG O(4) + BIG O(N) * 7 = BIG O( 3 + 7 * n )
    can be simplified to
    BIG O(n)
    *
    */

}
