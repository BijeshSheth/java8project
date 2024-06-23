package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMaxSumValueFromArray {

    public static void main(String[] args) {

        // Find min value
        List<Integer> a = Arrays.asList(2, 1, 3, 12, 32, 5, 34, 22, 33, 9);
        Optional<Integer> minResult = a.stream().reduce(Integer::min);
        minResult.ifPresent(System.out::println);

        // Find max value
        Optional<Integer> maxResult = a.stream().reduce(Integer::max);
        maxResult.ifPresent(System.out::println);

        // Find sum
        a.stream().reduce(Integer::sum).ifPresent(System.out::println);

        int max = a.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);


        int min = a.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);

    }
}
