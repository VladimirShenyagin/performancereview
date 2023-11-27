package core.part4166;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Supplier;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<Integer> integerOptional = Optional.of(5);
        Optional<Integer> emptyOptional = Optional.empty();
        Optional<Integer> nullableOptional = Optional.ofNullable(null);

        System.out.println(".or");
        System.out.println(
                integerOptional.or(() -> Optional.of(10))
        );
        System.out.println(
                emptyOptional.or(() -> Optional.of(10))
        );

        System.out.println();
        System.out.println("ifPresent");
        integerOptional.ifPresent(System.out::println);
        emptyOptional.ifPresentOrElse(System.out::println, new MyRunnable());

        System.out.println();
        System.out.println("isPresent");
        System.out.println(integerOptional.isPresent());
        System.out.println(emptyOptional.isPresent());

        System.out.println();
        System.out.println("isEmpty");
        System.out.println(integerOptional.isEmpty());
        System.out.println(emptyOptional.isEmpty());

        System.out.println();
        System.out.println(".orElse");
        System.out.println(
                integerOptional.orElse(orElseGet())
        );
        System.out.println(
                emptyOptional.orElse(orElseGet())
        );

        System.out.println();
        System.out.println("orElseGet");
        Supplier<Integer> supplier = OptionalDemo::orElseGet;
        System.out.println(
                integerOptional.orElseGet(supplier)
        );
        System.out.println(
                emptyOptional.orElseGet(supplier)
        );

        System.out.println();
        System.out.println(".get");
        System.out.println(integerOptional.get());
        try {
            System.out.println(emptyOptional.get());
        } catch (NoSuchElementException e) {
            System.out.println("Исключение NoSuchElementException");
        }

        System.out.println();
        System.out.println(".orElseThrow");
        try {
            System.out.println(integerOptional.orElseThrow());
            System.out.println(emptyOptional.orElseThrow());
        } catch (NoSuchElementException e) {
            System.out.println("Исключение NoSuchElementException");
        }

        System.out.println();
        System.out.println("filter");
        System.out.println(integerOptional.filter(e -> e > 4).isPresent());


    }

    private static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println(10);
        }
    }

    public static Integer orElseGet() {
        System.out.println("Вызван метод orElseGet");
        return 10;
    }

}
