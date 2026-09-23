class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
int pos=1;
int i=1;
while(i<n){
    if(nums[i]!=nums[i-1]){
        nums[pos]=nums[i];
        pos++;
    }
    i++;
}
return pos;
    }
}