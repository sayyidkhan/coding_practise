package timbuchalka.com;

public class Car extends Vehicle {

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public void changeGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " Gear.");
    }

    public void changeVelocity(int speed, int direction){
        move(speed,direction);
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
    }

    @Override
    public void stop() {
        super.stop();
    }
}
