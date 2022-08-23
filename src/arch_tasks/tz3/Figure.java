package arch_tasks.tz3;

public abstract class Figure implements Calculatable{
    protected String name;
    protected double length;
    protected double high;

    public Figure(String name, double length, double high) {
        this.name = name;
        this.length = length;
        this.high = high;
    }

    @Override
    public void print() {
        System.out.println("name: " +  name);
    }
}
