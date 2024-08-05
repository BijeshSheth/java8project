package important_interview_hacker_rank.string;

import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Bijesh";

        // Solution 1
        StringBuilder sb = new StringBuilder(input);
        System.out.println(sb.reverse().toString());

        System.out.println("=======================================");
        // Solution 2
        char[] c = input.toCharArray();
        for (int i = c.length-1; i >= 0; i--) {
            System.out.print(c[i]);
        }
        System.out.println();
        System.out.println("=======================================");


        // Solution 3
        System.out.println(Stream.of(input).map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining("")));
        System.out.println("=======================================");


        // Solution 4
        char[] charArray = input.toCharArray();
        IntStream.range(0, charArray.length).mapToObj(i -> charArray[charArray.length - 1-i]).forEach(System.out::print);
    }
}
