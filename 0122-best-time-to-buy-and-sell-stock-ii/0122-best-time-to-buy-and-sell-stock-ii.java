class Solution {
    public int maxProfit(int[] prices) {
     int low=prices[0];
     int prof=0;
     
     for(int i=1;i<prices.length;i++){
        low=Math.min(low,prices[i]);
        if(prices[i]>prices[i-1]){
            prof+=prices[i]-low;
            low=prices[i];
        }
     }   
     return prof;
    }
}