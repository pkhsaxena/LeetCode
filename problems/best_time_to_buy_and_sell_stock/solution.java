class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int max = Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        for (int i =0;i<prices.length;i++) {
			if(prices[i]<min){
                min = prices[i];
                max = Integer.MIN_VALUE;
            }
            if(prices[i]>max){
                max = prices[i];
            }
            if(max-min > profit){
                profit = max-min;
            }
	    }
        return profit;
    }
}