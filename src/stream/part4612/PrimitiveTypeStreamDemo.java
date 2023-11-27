package stream.part4612;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class PrimitiveTypeStreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2,3,5,7,9,11,22,122);
        Random random = new Random();
        IntStream.range(1,5).forEach(System.out::println);
        System.out.println();
        IntStream.rangeClosed(1,5).forEach(System.out::println);

        System.out.println(numbers.stream().mapToInt(e->e).average().orElse(0.));
        System.out.println(numbers.stream().mapToLong(e->e).sum());
        System.out.println(numbers.stream().mapToDouble(e->e).summaryStatistics());
    }
}
