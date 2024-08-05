package java8;

import java.util.stream.IntStream;

public class PrimeNumber {

    public static boolean isPrime(int n)
    {

        if(n == 0 || n == 1){
            return false;
        }
        if(n == 2){
            return true;
        }

        return IntStream.range(2, n/2).noneMatch(a -> n % a == 0);

    }

    public static void main(String[] args) {
        System.out.println(isPrime(13));

        System.out.println(Character.digit(157, 10));
    }
}
