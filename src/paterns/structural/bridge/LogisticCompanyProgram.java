package paterns.structural.bridge;

public class LogisticCompanyProgram extends Program{
    public LogisticCompanyProgram(Developer developer) {
        super(developer);
    }

    @Override
    public void createProgram() {
        System.out.println("creating logistic company program..");
        developer.writeCode();
    }
}
