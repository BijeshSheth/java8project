package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsFromTwoArrays {

    public static void solution1(int[] a, int[] b){
        List<Integer> list1 = Arrays.stream(a).boxed().toList();
        List<Integer> list2 = Arrays.stream(b).boxed().toList();

        List<Integer> list3 = list1.stream().filter(list2::contains).toList();
        for (int i : list3)
        {
            System.out.println(i);
        }
    }

    public static void solution2(int[] a, int[] b){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : a){
            set.add(i);
        }
        HashSet<Integer> set1 = new HashSet<>();
        for(int j : b){
            if(set.contains(j)){
                set1.add(j);
            }
        }
        System.out.println(set1);
    }

    public static void main(String[] args) {

        int[] a = {12, 22, 24, 34, 11};
        int[] b = {42, 52, 24, 34, 11};
        solution1(a, b);
        solution2(a, b);


    }
}
