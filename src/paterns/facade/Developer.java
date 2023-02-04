package paterns.facade;

public class Developer {
    public void doJob(BugTracker bugTracker){
        if (bugTracker.isSpringIsActive()){
            System.out.println("doing job.....");
        }
        else {
            System.out.println("read habr");
        }
    }
}
