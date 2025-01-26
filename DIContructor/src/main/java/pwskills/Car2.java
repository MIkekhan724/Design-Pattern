package pwskills;

public class Car2 implements  EngineInjector{
    private  Engine engine;

    @Override
    public void injectEngine(Engine engine) {
        this.engine= engine;
    }

    public void drive()
   {
       engine.start();
       System.out.println("Driving Car");
    }
}
