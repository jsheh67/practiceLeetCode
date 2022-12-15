package DecemberWeek2;

import java.util.Arrays;

public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int max=0;
        for(int i=0; i<prices.length-1; i++){
            int[] rest = Arrays.copyOfRange(prices,i+1,prices.length);
            int largest = Arrays.stream(rest).max().getAsInt();
            int profit = largest- prices[i];
            if(profit>max){
                max=profit;
            }
        }
        return max;
    }

}
