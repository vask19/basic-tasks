package arch_tasks.tz3;

public interface Calculatable {
    double calculateSquare();

    default void print(String  name) {
        System.out.println("name: " + name);

    }
}
