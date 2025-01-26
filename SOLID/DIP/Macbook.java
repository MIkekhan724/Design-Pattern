public class Macbook {
/*
 * here we are taking inteface rather than concrete class to ensure losse coupling
 * in construtor class we inject implementation class object and store in parent object this will ensure losse coupling
 * in future it will help to add new feature via injection
 */
  private final KeyBoard keyBoard;
  private final Mouse mouse;

  public Macbook(KeyBoard keyBoard, Mouse mouse)
  {
    this.keyBoard=keyBoard;
    this.mouse= mouse;
  }
}
