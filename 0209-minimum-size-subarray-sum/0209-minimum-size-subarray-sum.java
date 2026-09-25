class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int i=0;
        int sum=0;
        for(int j=0;j<n;j++){
            sum+=nums[j];
            while(sum>=target){
                int ans=j-i+1;
                min=Math.min(ans,min);
                sum-=nums[i];
                i++;
            }
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}