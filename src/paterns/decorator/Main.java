package paterns.decorator;

public class Main {
    public static void main(String[] args) {
        Developer developer = new TeamLeadDeveloper(new SeniorJavaDeveloper(new JavaDeveloper()));
        developer.makeJob();
    }
}
