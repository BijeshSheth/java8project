package java8;

import java.util.Arrays;
import java.util.List;

public class FindCommonCharFromTwoString {

    public static void main(String[] args) {

      List<String> list1 = Arrays.asList("Bijesh".split("")).stream().toList();
        List<String> list2 = Arrays.asList("Rajesh".split("")).stream().toList();
        list1.retainAll(list2);
        StringBuilder sb = new StringBuilder();

        for (String c : list1) {
            sb.append(c);
        }

        System.out.println(sb.toString());

    }
}
