package academy.learnprogramming;

public class Calculator {

    private Floor floor = new Floor(3, 5);
    private Carpet carpet = new Carpet(50);

    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return this.floor.getArea() * this.carpet.getCost();
    }
}
