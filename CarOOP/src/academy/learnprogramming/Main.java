package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        //define the type of porsche
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
