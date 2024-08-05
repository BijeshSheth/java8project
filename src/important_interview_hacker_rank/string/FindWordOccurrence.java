package important_interview_hacker_rank.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindWordOccurrence {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sam", "James", "Selena", "James", "Joe", "Sam", "James");
        // Find word the occurrence
        names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().forEach(System.out::println);
        System.out.println("==============");
        // Find word more than 2
        System.out.println(names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(map -> map.getValue() > 2)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));

        System.out.println("==============");

    }
}
