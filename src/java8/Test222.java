package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test222 {

    public static void main(String[] args) {

        String str ="Hello world";

        //str.chars().collect(Collections.)
        Optional<Map.Entry<String, Long>> map = Optional.of(Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get());

        System.out.println(map.get());
                //
    }
}
