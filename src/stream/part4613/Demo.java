package stream.part4613;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,1,2,3,4,5,6,7,8,9,4);

        System.out.println(integerList.stream().limit(2).toList());
        System.out.println(integerList.stream().skip(2).collect(Collectors.toList()));
        System.out.println(integerList.stream().takeWhile(e->e<5).toList());
        System.out.println(integerList.stream().dropWhile(e->e<5).toList());
    }
}
