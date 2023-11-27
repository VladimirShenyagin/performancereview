package stream.part4611;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(integerList.stream().map(e -> e * 2).collect(Collectors.toList()));
        System.out.println(integerList.stream().map(String::valueOf).collect(Collectors.joining()));
        System.out.println(integerList.stream().map(Double::valueOf).collect(Collectors.toList()));
        integerList.stream().mapToDouble(e -> e*2.5).forEach(System.out::println);
        integerList.stream().mapToLong(e -> e).forEach(System.out::println);
        List<String> strings = Arrays.asList("abc", "qwerty");
        strings.stream().flatMapToInt(String::chars).forEach(e-> System.out.print((char)e));
    }
}
