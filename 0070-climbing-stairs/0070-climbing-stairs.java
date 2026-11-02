class Solution {
    public int fibbo(int n,int dp[]){
        if(n==0||n==1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=fibbo(n-1,dp)+fibbo(n-2,dp);
        return dp[n];
    }
    public int climbStairs(int n) {
        if(n==0||n==1){
            return n;
        }
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        return fibbo(n,dp);
    }
}