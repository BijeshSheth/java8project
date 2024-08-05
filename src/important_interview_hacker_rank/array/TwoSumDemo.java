package important_interview_hacker_rank.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumDemo {

// if a=3 c=9 a+b=c
// 3+b=9
// b= 9–3=6
// then b=6
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int req = target - nums[i];
            if (map.containsKey(req)) {
                int arr[] = { map.get(req), i };
                return arr;
            }
            map.put(nums[i], i);
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 6, 4, 5, 5, 8};
        int sum = 10;
        int[] result = twoSum(nums, sum);
        for(int i : result){
            System.out.println(i);
        }
    }
}
