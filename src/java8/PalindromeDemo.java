package java8;

import java.io.InputStream;
import java.util.stream.IntStream;

public class PalindromeDemo {
    public static void main(String[] args) {

        String s = "ROTATOR";
        boolean isPalindrome = IntStream.range(0, s.length()/2).noneMatch(i -> s.charAt(i) != s.charAt(s.length()-i-1));

        IntStream.range(0, s.length()/2).noneMatch(i -> s.charAt(i)!=s.charAt(s.length()-i-1));

        if(isPalindrome){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
