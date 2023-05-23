package Task_5;

public class Car {
    private EngineType engine;

    public Car(EngineType engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}
