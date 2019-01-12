package my.room;

public class Dimensions {

    private int length;
    private int breadth;
    private int height;

    public Dimensions(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getHeight() {
        return height;
    }
}
