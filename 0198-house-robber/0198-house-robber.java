class Solution {
    public int thef(int nums[],int n,int dp[]){
        if(n==0){
            return nums[0];
        }
        if(n==1){
         return Math.max(nums[0],nums[1]);
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=Math.max(thef(nums,n-1,dp),nums[n]+thef(nums,n-2,dp));
        return dp[n];
    }
    public int rob(int[] nums) {
         int n=nums.length;
         int dp[]=new int[n+1];
         Arrays.fill(dp,-1);
         dp[0]=nums[0];


         return thef(nums,n-1,dp);
    }
}