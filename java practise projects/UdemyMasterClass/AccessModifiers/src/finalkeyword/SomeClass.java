package finalkeyword;

public class SomeClass {

    private static int classCounter = 0; // values that are common we only want to store it one time
    public final int instanceNumber;
    private final String name;

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);

    }

    public int getInstanceNumber() {
        return instanceNumber;
    }

}
