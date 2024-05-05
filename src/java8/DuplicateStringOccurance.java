package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateStringOccurance {
    public static void main(String[] args) {
        String name = "Bijeshshethriteshsheth";
        List<String> list = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(v -> v.getValue() > 2)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}