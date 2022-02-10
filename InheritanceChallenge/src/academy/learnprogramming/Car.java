package academy.learnprogramming;

public class Car extends Vehicle{

    private int lights;
    private int wipers;
    private int wheels;
    private int engine;

    public Car(String name, int size, int weight, int lights, int wipers, int wheels, int engine) {
        super(name, size, weight);
        this.lights = lights;
        this.wipers = wipers;
        this.wheels = wheels;
        this.engine = engine;
    }

    public int getLights() {
        return lights;
    }

    public void setLights(int lights) {
        this.lights = lights;
    }

    public void setWipers(int wipers) {
        this.wipers = wipers;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getWipers() {
        return wipers;
    }

    public int getWheels() {
        return wheels;
    }

    public int getEngine() {
        return engine;
    }

    @Override
    public void move(int speed) {
        System.out.println("All Four Wheels Start Moving");
        super.move(speed);
    }

    public static void startEngine(){
        System.out.println("Room the engine starts!");
    }

    public static void changeGears(){
        System.out.println("You change the gears");
    }

    public static void steer(){
        System.out.println("Turn that wheel!");
    }
}
