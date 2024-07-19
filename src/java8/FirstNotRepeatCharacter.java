package java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNotRepeatCharacter {

    public static void main(String[] args) {
        String str = "abcabe";
        Map<Character, Long> map = str.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        System.out.println(map);
        System.out.println(map.entrySet().stream().filter(c -> c.getValue() == 1).map(Map.Entry::getKey).findFirst().get());
        //Arrays.asList(str.split("")).stream().collect(Collectors.groupingBy(Function.identity()), Collectors.counting())
    }
}
