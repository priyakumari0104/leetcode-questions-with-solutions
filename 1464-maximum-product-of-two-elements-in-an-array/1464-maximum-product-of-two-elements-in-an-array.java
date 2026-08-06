class Solution {
    public int maxProduct(int[] nums) {
        int n= nums.length;
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                secmax=max;
                max=nums[i];
                
            }else if(nums[i]>secmax){
                secmax=nums[i];
            }
        }
        return(secmax-1)*(max-1);
    }
}