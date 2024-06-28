package java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoRandomStringComparing {

    public static void main(String[] args) {

        String s1 = "abcde";
        String s2 = "d c abe";

        String removeSpaceS1 = s1.replace(" ", "");
        String removeSpaceS2 = s2.replace(" ", "");

        String sortS1 = Arrays.stream(removeSpaceS1.split("")).sorted().toList().toString();
        String sortS2 = Arrays.stream(removeSpaceS2.split("")).sorted().toString();

        if(sortS1.equals(sortS2)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }


    }
}
