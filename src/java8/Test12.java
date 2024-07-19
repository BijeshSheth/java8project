package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test12 {

    public static void main(String[] args) {
        String s = "bijesh"; // Hashmap :
        String s1 = "rajesh";

        //j : 1, e : 1, e:1, h:1
        char[] c1 = s.toCharArray();
        char[] c2 = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        //Arrays.stream(s.split("")).filter(ss->s1.contains(ss)).

        /*for (int i = 0; i < c1.length; i++) {

            for (int j = 0; j < c2.length; j++) {
                   if(c1[i] == c2[j]){
                       map.put(c1[i])
                   }
            }
        }*/

        /*String s1 = "Amit";
        String s2 = new String("Amit");
        s2.intern()*/

        // s1 == s2 // false
        // s1.equal(s2);



    }
}
