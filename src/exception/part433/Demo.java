package exception.part433;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 0, 6, 7, 8, 9, 0);
        integerList.forEach(e -> {
            try {
                System.out.println(50 / e);
            } catch (ArithmeticException ex) {
                System.err.println(
                        "Arithmetic Exception occured : " + ex.getMessage());
            }
        });
    }
}
