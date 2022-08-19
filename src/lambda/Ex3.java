package lambda;

import java.util.List;
import java.util.stream.Collectors;

public class Ex3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,35,6,7,100,200,50,44,543,56,543);


        var l2 = list.stream().filter(el -> el % 2 == 0).toList();
        System.out.println(l2);

    }
}
