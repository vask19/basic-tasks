package paterns.decorator;

public class DeveloperDecorator implements Developer{



    private Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void makeJob() {
        developer.makeJob();

    }
}
