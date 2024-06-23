package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringStartWithNumber {

    public static void main(String[] args) {

        List<String> str = Arrays.asList("123asw","2312","sdfsdf","2sswed","aaaa");

        List<String> list = str.stream().filter(s -> Character.isDigit(s.charAt(0))).toList();
        for(String ss : list)
        {
            System.out.println(ss);
        }
    }
}
