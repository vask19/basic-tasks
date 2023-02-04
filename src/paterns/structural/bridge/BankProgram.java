package paterns.structural.bridge;

public class BankProgram extends Program{
    public BankProgram(Developer developer) {
        super(developer);
    }

    @Override
    public void createProgram() {
        System.out.println("creating bank program");
        developer.writeCode();
    }
}
