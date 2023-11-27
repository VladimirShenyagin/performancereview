package core.part453;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

import static core.part453.DemoConstants.TEST_LIST;

public class OperatorDemo {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = String::toUpperCase;
        System.out.println(unaryOperator.apply("test string"));

        BinaryOperator<Integer> binaryOperator = BinaryOperator.maxBy(Integer::compareTo);
        System.out.println(binaryOperator.apply(11,22));
    }
}
