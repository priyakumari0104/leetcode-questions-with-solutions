class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
       int dp[]=new int[n+1];
       return solve(n,dp);

    }
    public int solve(int idx,int dp[]){
        
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        if(dp[idx]!=0){
            return dp[idx];
         }
         
         solve(idx-1,dp);
         return dp[idx]=dp[idx-1]+dp[idx-2]+dp[idx-3];
    }
}