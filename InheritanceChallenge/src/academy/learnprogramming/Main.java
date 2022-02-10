package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
       //String name, int size, int weight, int lights, int wipers, int wheels, int engine, int bedLength, int bedWidth, boolean fourWheelDrive, int pullStrength
        F150 truck = new F150("Ford F150", 50, 1500, 4, 2, 4, 1, true, 100, 100, 25);
        truck.move(100);
        System.out.println(truck.getBedArea());
        truck.startEngine();
        truck.steer();
        System.out.println(truck.getSize());
    }
}
