class Solution {
    public int findidx(int []cost,int idx,int dp[]){
       if(idx==0||idx==1){
        return cost[idx];
       }
       if(dp[idx]!=-1){
        return dp[idx];
       }
       dp[idx]=cost[idx]+Math.min(findidx(cost,idx-1,dp),findidx(cost,idx-2,dp));
       return dp[idx];
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]=new int [n];
        Arrays.fill(dp,-1);
        dp[0]=cost[0];
        dp[1]=cost[1];
        return Math.min(findidx(cost,n-1,dp),findidx(cost,n-2,dp));
    }
}