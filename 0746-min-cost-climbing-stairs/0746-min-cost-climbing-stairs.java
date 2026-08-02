class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]= new int[n+1];
        Arrays.fill(dp, -1);
        return Math.min(stairs(cost,n-1,dp),stairs(cost,n-2,dp));
    }
    public int stairs(int []cost,int idx,int dp[]){
        if(idx==0||idx==1){
            return cost[idx];
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        
         return dp[idx]=cost[idx]+Math.min(stairs(cost,idx-1,dp),stairs(cost,idx-2,dp));
    }
      
}