package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        double width = 150;
        double height = 200;
        Wall wall1 = new Wall();
        Wall wall2 = new Wall(width, height);
        System.out.println(("Wall 1 Height: " + wall1.getHeight()));
        System.out.println(("Wall 2 Height: " + wall2.getHeight()));
        System.out.println("Wall 1 Width: " + wall1.getWidth());
        System.out.println("Wall 2 Width: " + wall2.getWidth());
        System.out.println("Wall 1 Area: " + wall1.getArea());
        System.out.println("Wall 2 Area: " + wall2.getArea());

    }
}
