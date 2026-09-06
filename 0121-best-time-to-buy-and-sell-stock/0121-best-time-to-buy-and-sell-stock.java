class Solution {
    public int maxProfit(int[] prices) {
int n=prices.length;
int max=0;
int low=prices[0];
for(int i=1;i<n;i++){
    low=Math.min(low,prices[i]);
    max=Math.max(max,prices[i]-low);
}
return max;
    }
}