package stream.part468;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,1,2,3,4,5,6,7,8,9);
        Integer sumAny = 0;
        Integer sumFirst = 0;

        System.out.println(integerList.parallelStream().findAny().get());
        System.out.println(integerList.parallelStream().findFirst().get());
        for (int i = 0; i<100000; i++) {
            sumAny+=integerList.parallelStream().findAny().get();
            sumFirst+=integerList.parallelStream().findFirst().get();
        }
        System.out.println(sumAny/100000.);
        System.out.println(sumFirst/100000.);
    }

}
