package paterns.creational.abstractfactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    DevOps getDevOps();
    Tester getTester();
}
