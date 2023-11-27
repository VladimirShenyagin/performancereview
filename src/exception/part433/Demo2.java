package exception.part433;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Demo2 {
    static <T, E extends Exception> Consumer<T> consumerWrapper(Consumer<T> consumer, Class<E> clazz) {
        return i -> {
            try {
                consumer.accept(i);
            } catch (Exception ex) {
                try {
                    E exCast = clazz.cast(ex);
                    System.err.println(
                            "Exception occured: " + exCast.getMessage());
                } catch (ClassCastException ccEx) {
                    throw ex;
                }
            }
        };
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 0, 7, 8, 9, 0);
        integerList.forEach(consumerWrapper(e -> System.out.println(50 / e), ArithmeticException.class));
    }
}
