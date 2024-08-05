package important_interview_hacker_rank.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordCountFromString {
    public static void main(String[] args) {
        String s = "Bijesh Sheth Bijesh Sheth Ritesh Sheth Nisarg Sheth";
        String word = "Sheth";
        int count = 0;
        // Solution 1
        System.out.println(Collections.frequency(Arrays.stream(s.split(" ")).toList(), word));

        // Solution 2
        List<String> list = Arrays.stream(s.split(" ")).toList();
        for (String str : list){
            if(word.equals(str)){
                count++;
            }
        }
        System.out.println(count);
    }
}
