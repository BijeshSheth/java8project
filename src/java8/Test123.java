package java8;

import java.util.HashMap;

public class Test123 {

    public static int solution(int[] A, int S) {
        int len = A.length;
        int[] diff = new int[len];
        for(int i=0;i<len;i++){
            diff[i] = A[i]-S;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int result = 0;
        for(int i=0;i<len;i++){
            sum+=diff[i];
            if(map.containsKey(sum)){
                result+=map.get(sum);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
            if(result > 1000000000){
                return 1000000000;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] A = {0, 4, 3, -1};
        int S = 2;
        System.out.println(solution(A, S));
    }
}
