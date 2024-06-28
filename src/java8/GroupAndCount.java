package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

record Account(int id, String currency){

}
public class GroupAndCount {
    /*public static void main(String[] args) {
       Account a1 = new Account(1, "DOLLAR");
        Account a2 = new Account(2, "INR");
        Account a3 = new Account(13, "INR");
        Account a4 = new Account(14, "DOLLAR");
        Account a5 = new Account(15, "DOLLAR");
        Account a6 = new Account(4, "DOLLAR");

        List<Account> list = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Map<String, Long> currencyCount = list.stream()
                .collect(Collectors.groupingBy(Account::currency, Collectors.counting()));
        currencyCount.forEach((currency, count) ->
                System.out.println("Currency: " + currency + ", Count: " + count));

        Future
    }*/

    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello, CompletableFuture!";
        });
        future.thenAccept(result -> System.out.println("The Result: " + result));
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The Result123: ");
    }
}
