package paterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Project project = new Project(1,"code","name");
        System.out.println("project 1: " + project);
        ProjectFactory projectFactory = new ProjectFactory(project);
        Project copy = projectFactory.copyProject();
        System.out.println("copy: " + copy);
    }
}
