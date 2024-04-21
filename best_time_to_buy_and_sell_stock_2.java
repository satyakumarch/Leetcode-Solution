https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
class Solution{
  public int MaxProfit(int [] prices){
    if(prices.length == 0){
      return 0;
    }
    int profit =0;
    for(int i = 0 ; i < prices.length -1 ;i++){
          if(prices[i+1] > prices[i]){
            profit += prices[i+1] - prices[i];
          }
    }
    return profit;
  }
}
