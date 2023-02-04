package paterns.creational.prototype;

public class Project implements Copyable{
    private int id;
    private String sourceCode;
    private String projectName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Project(int id, String sourceCode, String projectName) {
        this.id = id;
        this.sourceCode = sourceCode;
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", sourceCode='" + sourceCode + '\'' +
                ", projectName='" + projectName + '\'' +
                '}';
    }

    @Override
    public Object copy() {
        Project copy = new Project(id,sourceCode,projectName);
        return copy;
    }
}
