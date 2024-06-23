package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringOccurance {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Bijesh", "Bijesh", "Bijesh", "Bijesh", "Bijesh",
                "Ritesh", "Nisarg", "Nisarg", "Nisarg", "Nisarg", "Nisarg",
                "Ravi", "Abc", "Bijesh", "Ritesh", "Nisarg", "Ravi", "Abc",
                "Bijesh", "Ritesh", "Nisarg", "Ravi", "Abc", "Abc", "Abc", "Abc");

        Map<String, Long> map = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        LinkedHashMap<String, Long> countByWordSorted = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2)->{
                            throw new IllegalStateException();
                        },
                        LinkedHashMap::new
                ));

        for (Map.Entry<String,Long> entry : countByWordSorted.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
    }
}
