package pwskills;

public class Main {
    public static void main(String[] args) {
        // creating engine object
        Engine engine= new Engine();

        // Constructor injection
       // Car car= new Car(engine);
        //Car car= new Car();
        //car.setEngine(engine);
        //car.drive();

        Car2 car2= new Car2();
        car2.injectEngine(engine);
        car2.drive();
    }
}