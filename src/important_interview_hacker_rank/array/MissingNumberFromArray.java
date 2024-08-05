package important_interview_hacker_rank.array;

import java.util.Arrays;

// Find out the single missing number from Array
// input : 2, 3, 1, 4, 6, 7
// output : 5
public class MissingNumberFromArray {

    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 4, 6, 7};
        int n = arr.length+1;
        int sum = n * (n+1)/2;
        System.out.println(sum);

        int missingSum = Arrays.stream(arr).sum();

        System.out.println("Ans is : "+(sum-missingSum));

    }
}
