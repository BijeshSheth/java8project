package java8;

public class ArrayMaxSubArray {

    public static int result(int[] a){
        int max=0;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum+=a[j];
                System.out.print(a[j]+" ");
            }
            if(max<sum){
                max = sum;
            }
            System.out.println();
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, -3, 1, 6};
        System.out.println(result(a));
    }
}
