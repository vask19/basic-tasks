package paterns.creational.prototype;

public class ProjectFactory {
    private Project project;


    ProjectFactory(Project project){
        this.project = project;
    }

    public void setProject(Project project){
        this.project = project;
    }

    public Project copyProject(){
        return (Project) project.copy();
    }
}
