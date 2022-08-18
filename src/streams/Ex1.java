package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("123");
        list.add("33");
        List<Integer> l2 = list.stream().map(String::length)
                .filter(el -> el>=1)
                .sorted().toList();

        System.out.println(l2);
    }
}
