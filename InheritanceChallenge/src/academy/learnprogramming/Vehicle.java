package academy.learnprogramming;

public class Vehicle {
    private String name;
    private int size;
    private int weight;

    public Vehicle(String name, int size, int weight) {
        this.name = name;
        this.size = size;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void move(int speed){
        System.out.println("The speed the vehicle is moving: " + speed);
    }
}
