package academy.learnprogramming;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor theMonitor = new Monitor("27 Inch Beast", "Dell", 27, new Resolution(2540, 1440));
        MotherBoard motherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "V2.44");
        PC thePC = new PC(theCase, motherBoard, theMonitor);

        thePC.powerUp();
    }
}
