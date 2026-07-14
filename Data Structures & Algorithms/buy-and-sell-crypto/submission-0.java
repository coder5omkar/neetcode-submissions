class Solution {
    public int maxProfit(int[] prices) {

        if(prices.length <1) return 0;

        int low = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){
            if(low > price){
                low = price;
            }else if(price - low > maxProfit){
                maxProfit = price - low;
            }
        }
        
        return maxProfit;
    }
}
