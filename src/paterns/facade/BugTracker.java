package paterns.facade;

public class BugTracker {
    private boolean springIsActive;



    public void startSpring(){
        springIsActive = true;
    }

    public void finishSpring(){
        springIsActive = false;
    }



    public boolean isSpringIsActive() {
        return springIsActive;
    }

    public void setSpringIsActive(boolean springIsActive) {
        this.springIsActive = springIsActive;
    }
}
