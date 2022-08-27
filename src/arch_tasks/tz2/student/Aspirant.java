package arch_tasks.tz2.student;

public class Aspirant extends Student{
    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public double getScholarship() {
        if (averageMark == 5) {
            return 200;
        }
        return 100;
    }
}
