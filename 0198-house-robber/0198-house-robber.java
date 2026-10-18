class Solution {
    public int thef(int []nums,int dp[],int n){
    if(n==1){
        return nums[0];
    }
    if(n==2){
        return Math.max(nums[0],nums[1]);
    }
    if(dp[n]!=-1){
        return dp[n];
    }
    dp[n]=Math.max(thef(nums,dp,n-1),nums[n-1]+thef(nums,dp,n-2));
    return dp[n];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=nums[0];
        return thef(nums,dp,n);
    }
}