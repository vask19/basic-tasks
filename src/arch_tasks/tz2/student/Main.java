package arch_tasks.tz2.student;
import java.util.List;
public class Main {


    public static void main(String[] args) {
        List<Student> students = List.of(new Student("student","student","1",5)
                ,new Aspirant("aspirant","aspirant","2",5));
        students.forEach(el -> System.out.println(el.getScholarship()));
    }
}
