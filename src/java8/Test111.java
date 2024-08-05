package java8;

//Find nearest elements to a given element by +/- 10% :
//Given elements: [504, 321, 580, 299, 560, 390, 485, 500, 530, 510, 425, 496, 672]
//given element k = 500 : 50 : 450 - 550
//given percentage
//output : 504,

import java.util.ArrayList;
import java.util.List;

public class Test111 {

    public static List<Integer> getData(int data[], int element, int perc){

        List<Integer> list = new ArrayList<>();
        int min = element -(element*10/100);
        int max = element +(element*10/100);
                // prn/100
        for (int i : data){
            if(i>min && i<max)
            {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        int data[] = {504, 321, 580, 299, 560, 390, 485, 500, 530, 510, 425, 496, 672};
        int element = 500;
        int perc=50;
        getData(data, element, perc).stream().forEach(i -> System.out.print(i+" "));


    }


}
