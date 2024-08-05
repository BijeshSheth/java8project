package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharFromTwoString {

    public static void main(String[] args) {

      List<String> list1 = new ArrayList<>(Arrays.asList("Bijesh".split("")));
        List<String> list2 = new ArrayList<>(Arrays.asList("Rajesh".split("")));
        list1.retainAll(list2);
        StringBuilder sb = new StringBuilder();

        for (String c : list1) {
            sb.append(c);
        }

        System.out.println(sb.toString());

    }
}
