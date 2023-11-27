package stream.part467;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(2,3,4);

        System.out.println(integerList.stream().reduce(1, (a,b) -> a*b));
        System.out.println();

        System.out.println(integerList.stream().reduce(0, Integer::sum));
        System.out.println();

        Optional<Integer> optionalInteger = integerList.stream().reduce((a, b)->a-b);
        System.out.println(optionalInteger.get());
        System.out.println();

        List<String> strings = List.of("1", "2", "3", "4");
        Integer sum = strings.stream().reduce(0, (x, y) -> x + Integer.parseInt(y), Integer::sum);
        System.out.println(sum);
    }
}
