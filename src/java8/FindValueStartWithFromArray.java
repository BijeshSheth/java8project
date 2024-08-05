package java8;

import java.util.Arrays;
import java.util.List;

public class FindValueStartWithFromArray {

    public static void getValueStartWith(List<Integer> myList, int startWith){
        String startStr = String.valueOf(startWith);
        myList.stream()
                .map(String::valueOf)
                .filter(s -> s.startsWith(startStr))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        //find out all the numbers starting with 1 using Stream functions
        getValueStartWith(myList, 1);


 }

}
