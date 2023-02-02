package paterns.abstractfactory;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public DevOps getDevOps() {
        return new DockerDevOps();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }
}
