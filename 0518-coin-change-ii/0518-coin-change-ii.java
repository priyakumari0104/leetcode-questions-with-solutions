class Solution {
    int dp[][];
    public int change(int amount, int[] coins) {
        dp=new int[coins.length+1][amount+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
       return solve(0,amount,coins,dp);

    }
    public int solve(int idx,int amount,int []coins,int dp[][]){
        if(amount==0){
            return 1;
        }
        if(idx==coins.length){
            return 0;
        }
        if(dp[idx][amount]!=-1){
            return dp[idx][amount];
        }
        if(amount<coins[idx]){
            return dp[idx][amount]=solve(idx+1,amount,coins,dp);
        }
        int take=solve(idx,amount-coins[idx],coins,dp);
        int skip=solve(idx+1,amount,coins,dp);
        return dp[idx][amount]=take+skip;
    }
}