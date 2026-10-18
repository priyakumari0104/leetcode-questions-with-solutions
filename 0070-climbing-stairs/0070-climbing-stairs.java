class Solution {
    public int climb(int n,int dp[]){
     if(n==1||n==2){
        return n;
     }
     if(dp[n]!=0){
        return dp[n];
     }
     dp[n]=climb(n-1,dp)+climb(n-2,dp);
     return dp[n];

    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        return climb(n,dp);
    }
}