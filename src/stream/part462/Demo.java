package stream.part462;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.ShardingKey;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        Stream.of("test", "test2", "test3").forEach(System.out::println);

        System.out.println();

        String regex = " ";
        Pattern pattern = Pattern.compile(regex);
        String actualString = "test5 test6 test7 test8";
        Stream<String> stream = pattern.splitAsStream(actualString);
        stream.forEach(System.out::println);

        System.out.println();

        Path path = Path.of("src/stream/part462/testfile.txt");
        try (Stream<String> lineStream = Files.lines(path)) {
            lineStream.forEach(System.out::println);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        System.out.println();

        "string".chars().forEach(e-> System.out.println((char)e));

    }
}
