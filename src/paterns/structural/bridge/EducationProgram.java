package paterns.structural.bridge;

public class EducationProgram extends Program{
    public EducationProgram(Developer developer) {
        super(developer);
    }

    @Override
    public void createProgram() {
        System.out.println("creating education program....");
        developer.writeCode();

    }
}
