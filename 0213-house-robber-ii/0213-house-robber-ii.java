class Solution {
    public int thef(int nums[],int dp[],int n){
        if(n==1){
            return nums[0];
        }if(n==2){
            return Math.max(nums[0],nums[1]);
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=Math.max(thef(nums,dp,n-1),nums[n-1]+thef(nums,dp,n-2));
        return dp[n];
    }
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int n=nums.length;
        int dp1[]=new int[n+1];
        int dp2[]=new int[n+1];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        dp1[0]=nums[0];
        dp2[0]=nums[1];
        int[] arr1 = Arrays.copyOfRange(nums, 0, n - 1);
        int[] arr2 = Arrays.copyOfRange(nums, 1, n);
        return Math.max(thef(arr1,dp1,arr1.length),thef(arr2,dp2,arr2.length));
    }
}