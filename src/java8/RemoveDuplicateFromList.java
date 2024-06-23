package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(23, 12, 12, 23, 11, 22, 33, 22, 12, 90, 89, 1, 23, 2);

        // Remove Duplicate
        list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("===============");

        // remove duplicate and sorting
        list.stream().collect(Collectors.toSet()).stream().sorted().forEach(System.out::println);

    }
}
