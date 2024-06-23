package java8;

import java.util.Arrays;
import java.util.List;

public class OddEvenNumber {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(23, 12, 34, 23, 11, 22, 33, 55, 12, 90, 89, 1, 3, 2);

        List<Integer> evenList = list.stream().filter(i -> i%2==0).toList();
        for(int i : evenList){
            System.out.print(i+"  ");
        }
        //evenList.forEach(System.out::print);
        System.out.println();

        List<Integer> oddList = list.stream().filter(i -> i%2!=0).toList();
        //oddList.forEach(System.out::print);
        for(int j : oddList){
            System.out.print(j+"  ");
        }
    }
}
