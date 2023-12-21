class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int prof = 0;
        int buy=0, sell=0;
        for(int i=0;i<prices.size();i++){
            if(prices[i]<prices[buy]){
                buy=i;
            }
            prof = max(prices[i]-prices[buy], prof);
        }
        return prof;
    }
};