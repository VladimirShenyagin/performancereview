package stream.part465;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {

        System.out.println(Stream.of(1,2,3,4,5,6,7,8,9,0).collect(Collectors.toList()));
        System.out.println(Stream.of(1,2,3,4,5,6,7,8,9,0).collect(Collectors.toSet()));
        System.out.println(Stream.of(1,2,3,4,5,6,7,8,9,0).collect(Collectors.toMap(e->e, e->e*2)));
        System.out.println(Stream.of(1,2,3,4,5,6,7,8,9,0).collect(Collectors.toCollection(ArrayList::new)).toString());

    }
}
