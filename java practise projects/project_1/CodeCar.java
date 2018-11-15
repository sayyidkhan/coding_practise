class CodeCar {

    int modelYear;

    public CodeCar(int year) {

        modelYear = year;

    }

    public void startEngine() {

        System.out.println("Vroom!");

    }

    public void drive(int distanceInMiles) {

        System.out.println("Your car drove " + distanceInMiles + " miles!");

    }

    public int numberOfTires() {

        return 4;

    }

    public static void main(String[] args){

        CodeCar myFastCar = new CodeCar(2007);
        myFastCar.startEngine();
        myFastCar.drive(1628);

        int tires = myFastCar.numberOfTires();
        System.out.println(tires);
        /*System.out.println(myFastCar.numberOfTires());*/ // also works too
    }
}