package lambda;

import java.util.List;

public class Ex2 {

    public  static void printIs(List<Employee> listEmployees,EmployeeCh employeeCh){
        for (Employee employee:listEmployees){
            if (employeeCh.check(employee)){
                System.out.println(employee);
            }
        }
    }

    public static void main(String[] args) {
        printIs(List.of(new Employee("1",5),new Employee("2",20),new Employee("3",22)),(emp)->{return emp.age > 18;});
    }

}

class Employee{
    String name;
    int age;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

interface EmployeeCh{
    boolean check(Employee employee);
}
