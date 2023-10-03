import java.util.Arrays;

public class stocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int profit=0;
        int n = prices.length;
        Arrays.sort(prices);
        profit = prices[n-1]-prices[0];
        System.out.println(profit);
    }
}
