class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
     int slow=0;
     int fast=1;
     while(fast<n){
        if(nums[slow]!=nums[fast]){
            int temp=nums[slow+1];
            nums[slow+1]=nums[fast];
        nums[fast]=temp;
        slow++;
        }
        fast++;
     }
     return slow+1;

    }
}