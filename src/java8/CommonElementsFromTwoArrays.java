package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsFromTwoArrays {
    public static void main(String[] args) {

        //int a[] = {12, 22, 24, 34, 11};
        //int b[] = {42, 52, 24, 34, 11};

        List<Integer> list1 = Arrays.asList(11, 22, 24, 34, 1);
        List<Integer> list2 = Arrays.asList(42, 52, 24, 34, 11);


        List<Integer> list3 = list1.stream().filter(list2::contains).toList();
        for (int i : list3)
        {
            System.out.println(i);
        }

    }
}
