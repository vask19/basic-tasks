package lambda;

import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,5,42,3,4,55,6);
        var sum = list.stream().reduce((ac,el)-> ac/el);
        System.out.println(sum.orElse(-1));
    }
}
