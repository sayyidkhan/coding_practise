package car.blueprint;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car(); // holden is a australian brand car

        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }

}
