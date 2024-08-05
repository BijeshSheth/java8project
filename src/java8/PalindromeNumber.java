package java8;

import java.util.stream.IntStream;

public class PalindromeNumber {

     public static boolean isPalindrome(int n)
     {
         String value = String.valueOf(n);
         int len = value.length();
         boolean isPalindromeNumber = IntStream.range(0, len / 2)
                 .noneMatch(index -> value.charAt(index) == value.charAt(len - index - 1));
         return isPalindromeNumber;
     }

    public static void main(String[] args) {
        System.out.println(isPalindrome(16461)); //165461
    }

}
