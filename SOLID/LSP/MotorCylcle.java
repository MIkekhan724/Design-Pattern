public class MotorCylcle implements Bike {

  boolean isEngineOn;

  int speed;

  @Override 
  public void turnOnEngine()
  {
    // turn on the Engine!
    isEngineOn=true;
  }

  public void accelerate(){
    // Increase the speed
    speed= speed+10;
  }
  
}
