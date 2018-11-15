public class Ferrari extends Car{
  private int myCost;
  // extends represents "is a" relationship
  public Ferrari(){
    myCost = 300000; // 300k
  }
  public int getMyCost(){
    return myCost; // note car does not have this method
  }
}