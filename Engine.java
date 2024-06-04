
public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}


 class Car {
    private String model;
    private Engine engine;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
}


    class Main{
    public static void main(String[] args) {
        Engine carEngine = new Engine("V6");
        Car myCar = new Car("Toyota Camry", carEngine);

        System.out.println("My car model: " + myCar.getModel());
        System.out.println("My car engine type: " + myCar.getEngine().getType());
    }
}