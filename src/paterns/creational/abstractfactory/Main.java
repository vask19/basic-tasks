package paterns.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        ProjectTeamFactory factory = new BankingTeamFactory();
        Developer developer  = factory.getDeveloper();
        Tester tester = factory.getTester();
        DevOps devOps = factory.getDevOps();
        developer.writeCode();
        tester.testCode();
        devOps.configureSystem();

    }
}
