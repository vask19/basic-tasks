package paterns.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }



    public void makeCoReview(){
        System.out.println("making code review....");
    }
    @Override
    public void makeJob() {
        super.makeJob();
        makeCoReview();
    }
}
