import java.util.ArrayList;

class IntClass {

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    private int myValue;

}

public class Main {

    public static void main(String[] args) {

        String[] strArray = new String[10]; // arrays
        int[] intArray = new int[10];


        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("tim");

        // ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        // using autoboxing & unboxing, for quick creation of integer class
        Integer integer = new Integer(54 );
        Double doubleValue = new Double(12.25);

//        ArrayList<Integer> integerArrayList = new ArrayList<Integer>(); // init a Integer arraylist class
//        for(int i = 0; i <= 10;i++){
//            integerArrayList.add(Integer.valueOf(i));
//        }
//
//        for(int i = 0; i <= 10;i++){
//            System.out.println(i + " --> " + integerArrayList.get(i).intValue());
//        }

        // short way of creating autoboxing & unboxing

        Integer myIntValue = 56; // at compile time it will read as // Integer.valueOf(56)
        int myInt = myIntValue; // at compile time it will read as  // myIntValue.intValue();

        ArrayList<Double> myDoubleValue = new ArrayList<Double>();
        for(double dbl  = 0.0; dbl <= 10.0; dbl += 0.5){
            myDoubleValue.add(dbl);
        }

        for(int i = 0; i < myDoubleValue.size(); i++){
            double value = myDoubleValue.get(i);
            System.out.println(i + " --> " + value);
        }

        ///
    }
}
