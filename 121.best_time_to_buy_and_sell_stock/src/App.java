public class App {
    public static void main(String[] args) throws Exception {
        int[] array = {2,4,1};
        System.out.println(maxProfit(array));
    }

    public static int maxProfit(int[] prices){
        int minSoFar = Integer.MAX_VALUE; // max value so anything will be lower.
        int result = 0;
        int profit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minSoFar){
                minSoFar = prices[i]; // smallest found thus far
            }
            profit = prices[i] - minSoFar;
            if(result < profit){
                result = profit;
            }
        }
        return result;
    }
}