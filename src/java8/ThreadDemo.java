package java8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
// I/p= {4,6,5,-10,8,5,20} :
// Target sum=10
// Print pairs of integers from above array which matches the sum
public class ThreadDemo {

    public static void test(int[] a, int sum){
        for (int i = 0; i < a.length; i++) {
            int a1 = a[i];
            int s = 0;
            for (int j = i+1; j < a.length ; j++) {
                s = a1+a[j];
                if(s == sum){
                    System.out.print(a[i]+","+a[j]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] a = {4,6,5,-10,8,5,20};
         int sum = 10;
        test(a, sum);

    }
}
