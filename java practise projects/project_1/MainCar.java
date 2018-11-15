public class MainCar{
  public static void main(String[] theArgs){
    System.out.println("hello world");
  
  Car testCar = new Car();
  // we have a car object.
  // we can now ask for the speed
  
  System.out.println(testCar.getBreakSpeed());
  testCar.setBreakSpeed(23);
  System.out.println(testCar.getBreakSpeed());
  

  //Ferrari testFerrari = new Ferrari();
  //System.out.println(testFerrari.getMyCost());
  }
}
