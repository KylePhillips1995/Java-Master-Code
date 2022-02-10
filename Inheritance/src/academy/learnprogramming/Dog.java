package academy.learnprogramming;

public class Dog extends Animal{
    //initialize dog only fields
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //constructor
    public Dog(int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        //Calls constructor from the inherited class.
        super(1, 1, size, weight, name);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog Chewed");
    }

    @Override
    public void eat() {
        chew();
        System.out.println("Dog Ate");
        super.eat();
    }

    public void walk(){
        System.out.println("The dog is walking");
        move(2);
    }

    public void run(){
        System.out.println("The dog is running");
        move(4);
    }

    private void moveLegs(int speed){
        System.out.println("Dogs legs moved");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog Moving");
        moveLegs(speed);
        super.move(speed);
    }
}
