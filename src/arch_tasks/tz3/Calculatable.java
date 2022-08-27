package arch_tasks.tz3;

public interface Calculatable {
    double calculateSquare();

    default void print() {
        System.out.println(this.getClass().getSimpleName());
    }
}
