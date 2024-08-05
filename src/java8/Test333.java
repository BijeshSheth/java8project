package java8;

public class Test333 {

    public static int getMaxProfit(int[] a){
        int maxProfit = 0;
        // int[] prices = {7,1,5,3,6,4};
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i] > a[j]){
                    continue;
                }
                else {
                    int diff = a[j]-a[i];
                    if(maxProfit < diff){
                        maxProfit = diff;
                    }
                }
            }
        }
        return maxProfit;
    }

    public static int getMaxProfit1(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i];

            // Update maxProfit if selling on the current day yields a higher profit
            maxProfit = Math.max(maxProfit, currentPrice - minPrice);

            // Update minPrice if the current price is lower than the previous minPrice
            minPrice = Math.min(minPrice, currentPrice);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        //Output: 5
        System.out.println(getMaxProfit1(prices));
    }
}
