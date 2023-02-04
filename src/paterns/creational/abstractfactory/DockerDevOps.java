package paterns.creational.abstractfactory;

public class DockerDevOps implements DevOps{
    @Override
    public void configureSystem() {
        System.out.println("configure docker containers");
    }
}
