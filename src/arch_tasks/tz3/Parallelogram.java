package arch_tasks.tz3;

public class Parallelogram extends Figure{
    public Parallelogram(String name, double length, double high) {
        super(name, length, high);
    }

    @Override
    public double calculateSquare() {
        return high*length;
    }


}
