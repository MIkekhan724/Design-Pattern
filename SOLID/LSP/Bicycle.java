public class Bicycle implements Bike{
  public void turnOnEngine()
  {
    throw new AssertionError("There is no Engine");
  }

  /*
   * Here we are breaking the Liskov subtition principle
   * We are narrowing the properties or feature of parent object (suppose we get the object of MotorCycle)
   * We should not do that instead of we create new inteface
   * we need to always add new faeture not narrowing the parent feature.
   */

  public void accelerate(){
    // Do SomeThing
  }
}

