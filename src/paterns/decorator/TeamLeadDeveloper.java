package paterns.decorator;

import paterns.structural.bridge.JavaDeveloper;

public class TeamLeadDeveloper extends DeveloperDecorator {

    public TeamLeadDeveloper(Developer developer) {
        super(developer);
    }

    public void sendWeakReport(){
        System.out.println("sending weak report....");
    }

    @Override
    public void makeJob() {
        super.makeJob();
        sendWeakReport();
    }
}
