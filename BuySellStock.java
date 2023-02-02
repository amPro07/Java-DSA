public class BuySellStock {
    public static void main(String[] args) {
        int prices[] = {7,1, 5,3,6,4};
        buyOrSell(prices);
    }

    private static void buyOrSell(int[] prices) {
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){//profit
                int profit = prices[i] - buyPrice;//todays profit
                maxProfit = Integer.max(maxProfit, profit);
            }else{//buy the stocks
                buyPrice = prices[i];
            }
        }
        System.out.println(maxProfit);

    }
}
