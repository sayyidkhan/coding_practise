package arrays.arrays;

public class AndreiReverseAString {

    public static void main(String[] args) {
        System.out.println(reverseString("Hi i am jack"));
    }

    private static String reverseString(String value){
        if(value.length() == 1){
            return value;
        }
        else {
            String[] currentString = value.split("");
            String[] reversedString = new String[value.length()];
            int j = 0;
            for(int i = value.length() - 1;i >= 0;i--){
                reversedString[j] = currentString[i];
                j++;
            }
            return String.join("",reversedString);
        }
    }

}
