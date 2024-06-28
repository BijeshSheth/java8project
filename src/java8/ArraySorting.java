package java8;

import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {
        int[] i = {2, 121, 122, 123, 1, 332, 5, 4};
        Arrays.sort(i);
        int count = 1;
        for (int j=0;j<i.length; j++){

            if(i[j]+1 == i[j+1]){
                count++;
            }
            else{
                continue;
            }
        }
        System.out.println(count);

    }
}
