package arch_tasks.tz3;

public class Romb extends Figure{
    public Romb(String name, double length, double high) {
        super(name, length, high);
    }

    @Override
    public double calculateSquare() {
        return 0;
    }

    @Override
    public void print() {
        super.print(name);
    }
}
