class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int slow=0;
        int fast=0;
        while(fast<n){
            if(nums[fast]!=val){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}