package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Int111 {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        //find out all the numbers starting with 1 using Stream functions

        myList.stream().filter(i -> i.toString().startsWith("1")).toList().forEach(System.out::println);

 }

}
