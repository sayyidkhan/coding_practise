package my.room;

public class RoomFurniture {

    private Furniture theTable;
    private Furniture theChair;
    private Television theTelevision;
    private Furniture theBed;

    public RoomFurniture(Furniture theTable, Furniture theChair, Television theTelevision, Furniture theBed) {
        this.theTable = theTable;
        this.theChair = theChair;
        this.theTelevision = theTelevision;
        this.theBed = theBed;
    }




    public Furniture getTheTable() {
        return theTable;
    }

    public Furniture getTheChair() {
        return theChair;
    }

    public Television getTheTelevision() {
        return theTelevision;
    }

    public Furniture getTheBed() {
        return theBed;
    }
}
