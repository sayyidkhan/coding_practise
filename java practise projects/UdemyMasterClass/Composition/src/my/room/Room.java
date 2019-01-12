package my.room;

public class Room {

    public String getRoomColor() {
        return roomColor;
    }

    public Dimensions getRoomSize() {
        return roomSize;
    }

    public RoomFurniture getTheRoomFurniture() {
        return theRoomFurniture;
    }

    private String roomColor;
    private Dimensions roomSize;
    private RoomFurniture theRoomFurniture;

    public Room(String roomColor, Dimensions roomSize, RoomFurniture theRoomFurniture) {
        this.roomColor = roomColor;
        this.roomSize = roomSize;
        this.theRoomFurniture = theRoomFurniture;
    }


}
