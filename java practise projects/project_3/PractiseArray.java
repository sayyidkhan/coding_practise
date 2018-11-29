import java.util.ArrayList;
import java.util.Iterator;

public class PractiseArray {

    public static void main(String[] args) {

        // ArrayList Example
        ArrayList<String> arrlistobj = new ArrayList<String>();
        arrlistobj.add("Alive is Awesome");
        arrlistobj.add("Love Yourself");
        Iterator it = arrlistobj.iterator();
        System.out.print("ArrayList object output:\n");
        while (it.hasNext())
            System.out.print(it.next() + "\n");
        // ArrayList Example

        // Array Example
        String[] arrayobj = new String[3];
        arrayobj[0] = "Love Yourself";
        arrayobj[1] = "Alive is Awesome";
        arrayobj[2] = "Be in Present";

        System.out.print("Array object output:\n");
        for (int i = 0; i < arrayobj.length; i++){
            System.out.println( (i+1) + " " + arrayobj[i]);
        }
        // Array Example
    }

}