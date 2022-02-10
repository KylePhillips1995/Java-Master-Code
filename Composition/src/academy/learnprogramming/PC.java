package academy.learnprogramming;

public class PC {

    //inheritance can be limited to 1 class at a time. This way we have 3 classes via obj instances.(Composition)
    private Case theCase;
    private MotherBoard motherBoard;
    private Monitor monitor;

    public PC(Case theCase, MotherBoard motherBoard, Monitor monitor) {
        this.theCase = theCase;
        this.motherBoard = motherBoard;
        this.monitor = monitor;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //fancy stuff
        monitor.drawPixelAt(1250, 50, "blue");
    }
}
