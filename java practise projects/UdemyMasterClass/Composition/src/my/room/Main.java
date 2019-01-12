package my.room;

public class Main {

    // Create a single room of a house using composition.
    // Think about the things that should be included in the room.
    // Maybe physical parts of the house but furniture as well
    // Add at least one method to access an object via a getter and
    // then that objects public method as you saw in the previous video
    // then add at least one method to hide the object e.g. not using a getter
    // but to access the object used in composition within the main class
    // like you saw in this video.

    public static void main(String[] args) {

        // create all furniture
        Furniture table = new Furniture("table","Nil",new Dimensions(1000,1000,100),"brown");
        Furniture chair = new Furniture("chair","Nil",new Dimensions(100,100,50),"brown");
        Furniture bed = new Furniture("bed","Nil",new Dimensions(2000,2000,20),"black");

        // create television
        Television sonyTv = new Television("SONY",1920,1080);

        // group objects
        RoomFurniture roomFurniture;
        roomFurniture = new RoomFurniture(table,chair,sonyTv,bed);

        // room
        Room myRoom;
        myRoom = new Room("Red",new Dimensions(20_000,20_000,20_000),roomFurniture);
        System.out.println(myRoom.getTheRoomFurniture().getTheBed().getFurnitureType());
    }

}
