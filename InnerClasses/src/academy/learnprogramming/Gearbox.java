package academy.learnprogramming;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    //changed to currentNumber to avoid duplicate variables in inner class.
    private int currentNumber = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        for(int i = 0; i<maxGears; i++){
            addGear(i, i *5.3);
        }
    }

    public void operateClutch(boolean in){
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio){
        if((number > 0) && (number <= maxGears)){
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear){
        if(newGear >= 0 && newGear < this.gears.size() && this.clutchIsIn){
            this.currentNumber = newGear;
            System.out.println("Gear " + newGear + " selected.");
        }
        else{
            System.out.println("Grind!");
            this.currentNumber = 0;
        }
    }

    public double wheelSpeed(int revs){
        if(clutchIsIn){
            System.out.println("Scream!!!");
            return 0.0;
        }
        else{
            return revs * gears.get(currentNumber).getRatio();

        }
    }
    //inner class of gearbox. not needed without gearbox Using this. is very useful in inner classes.
    //to access gearNumber in gearbox instead of gear use Gearbox.gearNumber or rename the variable.
    public class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs){
            return revs * (this.ratio);
        }
    }
}
