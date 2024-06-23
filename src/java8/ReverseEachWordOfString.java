package java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordOfString {
    public static void main(String[] args) {

        String name = "Bijesh Sheth Ritesh Sheth";
        String s1 = Arrays.asList(name.split(" "))
                .stream().map(s -> new StringBuffer(s).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(s1);

    }
}
