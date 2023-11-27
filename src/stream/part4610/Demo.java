package stream.part4610;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,1,2,3,4,5,6,7,8,9);
        System.out.println(integerList.stream().anyMatch(e->e>5));
        System.out.println(integerList.stream().anyMatch(e->e>10));
        System.out.println(integerList.stream().allMatch(e->e>5));
        System.out.println(integerList.stream().allMatch(e->e>0));
        System.out.println(integerList.stream().noneMatch(e->e>5));
        System.out.println(integerList.stream().noneMatch(e->e>10));

    }
}
