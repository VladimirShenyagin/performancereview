package core.part453;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

import static core.part453.DemoConstants.TEST_LIST;
import static core.part453.DemoConstants.TEST_MAP;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = e -> e > 5;
        TEST_LIST.stream().filter(predicate).forEach(System.out::println);

        BiPredicate<Integer, String> biPredicate = (a, b) -> a < b.length();
        TEST_MAP.entrySet().stream().filter(e->biPredicate.test(e.getKey(), e.getValue())).forEach(System.out::println);
    }
}
