public class Car{
  // all uppercase? Its static
  //private static final int SPEED = 1;
  // lowercase? probably not static
  private int myBreakSpeed;
  // final data cant be changed. non final can.
  public Car()
  {
    // non statics variables get set in the constructor
    myBreakSpeed = 1;
  }
  public void setBreakSpeed(int theSpeed)
  {
    myBreakSpeed = theSpeed;
    // generally instance variable start with my
  }
  public int getBreakSpeed()
  {
    return myBreakSpeed;
  }

}