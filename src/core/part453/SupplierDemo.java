package core.part453;

import java.util.function.Supplier;

import static core.part453.DemoConstants.TEST_LIST;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> {
            int index = (int)(Math.random() * TEST_LIST.size());
            return TEST_LIST.get(index);
        };
        for (int i = 0; i < 10; i++) {
            System.out.println(supplier.get());
        }
    }
}