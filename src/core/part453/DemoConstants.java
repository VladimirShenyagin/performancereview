package core.part453;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class DemoConstants {
    public static final List<Integer> TEST_LIST = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
    public static final List<Integer> TEST_LIST_2 = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0);
    public static final Map<Integer, String> TEST_MAP = getTestMap();

    public static Map<Integer, String> getTestMap() {
        Map<Integer, String> result = new HashMap<>();
        result.put(1, "первый");
        result.put(2, "второй");
        result.put(3, "третий");
        result.put(4, "четвёртый");
        result.put(5, "пятый");
        return result;
    }

}
