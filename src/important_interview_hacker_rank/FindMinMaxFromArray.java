package important_interview_hacker_rank;

import java.util.Arrays;

public class FindMinMaxFromArray {


    public static void main(String[] args) {
        int[] arr = {2, 3, 12, 34 ,23, 2, 3, 4 , 5, 11};

        // Solution 1
        System.out.println(Arrays.stream(arr).min().getAsInt());
        System.out.println(Arrays.stream(arr).max().getAsInt());

    }
}
