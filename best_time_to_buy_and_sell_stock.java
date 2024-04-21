// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
pseudo code explained before real java code
{
        int lsf = Integer.MAX_VALUE; // least so far
        int op = 0; // overall profit
        int pist = 0; // profit if sold today
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){ // if we found new buy value which is more smaller then previous one
                lsf = prices[i]; // update our least so far
            }
            pist = prices[i] - lsf; // calculating profit if sold today by, Buy - sell
            if(op < pist){ // if pist is more then our previous overall profit
                op = pist; // update overall profit
            }
        }
        return op; // return op 
     }
 }
     
class Solution {
    public int maxProfit(int[] prices) {
       int  min_val = Integer.MAX_VALUE;
        int max_profit = 0 ;
        
        for(int i =0 ;i<prices.length;i++)
        {
            if(prices[i]<min_val){
                min_val = prices[i];
            }
            else if(prices[i] - min_val > max_profit){
                max_profit = prices[i] - min_val;
            }
        }   
        return max_profit;
    }
}
