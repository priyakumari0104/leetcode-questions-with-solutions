class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                sum++;
                max=Math.max(sum,max);
            }else{
                sum=0;
            }
        }
        return max;
    }
}