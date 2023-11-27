package core.part453;

import java.util.function.BiFunction;
import java.util.function.Function;

import static core.part453.DemoConstants.TEST_LIST;
import static core.part453.DemoConstants.TEST_MAP;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, Double> function = e -> (double) e / 2;
        TEST_LIST.stream().map(function).forEach(System.out::println);

        BiFunction<Integer, String, String> biFunction = (a, b) -> a + "-" + b + "!";
        TEST_MAP.compute(1, biFunction);
        System.out.println(TEST_MAP);
    }
}
