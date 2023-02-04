package paterns.decorator;

public final class JavaDeveloper implements Developer{
    @Override
    public void makeJob() {
        System.out.println("writing java code");
    }
}
