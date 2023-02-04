package paterns.structural.bridge;

public class JsDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("writing JS code");
    }
}
