package timbuchalka.com;

public class Outlander extends Car {

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    private int roadServiceMonths;



}
