class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        int n=nums.length;
        if(k<=1){
            return 0;
        }
       int left=0;
       int right=0;
       int prd=1;
       while(left<n&&right<n){
            prd*=nums[right];
            right++;
             while(prd>=k){
                prd=prd/nums[left];
                left++;
            }
        
                count+=right-left;
        
           
           
       }
       return count;
    }
}