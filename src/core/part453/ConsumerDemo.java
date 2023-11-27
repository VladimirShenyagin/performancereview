package core.part453;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import static core.part453.DemoConstants.TEST_LIST;
import static core.part453.DemoConstants.TEST_MAP;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> integerConsumer = (e) -> System.out.println(e);
        integerConsumer = System.out::print;
        TEST_LIST.forEach(integerConsumer);
        System.out.println();
        BiConsumer<Integer, String> biConsumer = (x, y) -> System.out.println(y + ": " + x);
        TEST_MAP.forEach(biConsumer);
    }
}