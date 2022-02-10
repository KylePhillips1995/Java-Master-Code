package academy.learnprogramming;

public class F150 extends Car{

    private int bedLength;
    private int bedWidth;
    private boolean fourWheelDrive;
    private int pullStrength;

    public F150(String name, int size, int weight, int lights, int wipers, int wheels, int engine, boolean fourWheelDrive, int pullStrength, int bedLength, int bedWidth) {
        super(name, size, weight, lights, wipers, wheels, engine);
        this.bedLength = bedLength;
        this.bedWidth = bedWidth;
        this.fourWheelDrive = fourWheelDrive;
        this.pullStrength = pullStrength;
    }

    public int getBedLength() {
        return bedLength;
    }

    public int getBedWidth() {
        return bedWidth;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public int getPullStrength() {
        return pullStrength;
    }

    public void setBedLength(int bedLength) {
        this.bedLength = bedLength;
    }

    public void setBedWidth(int bedWidth) {
        this.bedWidth = bedWidth;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public void setPullStrength(int pullStrength) {
        this.pullStrength = pullStrength;
    }

    public int getBedArea(){
        return bedLength * bedWidth;
    }

    @Override
    public void move(int speed) {
        super.move(speed);
        System.out.println("Big Trucks move the FASTEST");
    }
}
