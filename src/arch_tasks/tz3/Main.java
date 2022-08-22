package arch_tasks.tz3;

import java.awt.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Figure parallelogram = new Parallelogram("parallelogram",20.0,15.0);
        Figure romb = new Parallelogram("romb",12.0,24.0);
        Figure triangle = new Parallelogram("triangle",43.0,22.0);
        List<Figure> figureList = List.of(parallelogram,romb,triangle);
        figureList.stream().forEach(el ->{
            el.calculateSquare();
            el.print();
        });
    }
}
