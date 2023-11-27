package stream.part469;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,4,1,3,2,5,9,6,8,7);

        integerList.stream().sorted().forEach(System.out::print);
        System.out.println();
        integerList.stream().sorted((a,b) -> -a.compareTo(b)).forEach(System.out::print);
        System.out.println();
        integerList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
    }
}
