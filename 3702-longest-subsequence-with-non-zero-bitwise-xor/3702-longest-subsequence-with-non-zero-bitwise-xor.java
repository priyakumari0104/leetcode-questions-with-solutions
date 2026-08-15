class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
long sum=0;
    for(int i=0;i<n;i++){
        sum+=nums[i];
    }
    if(sum==0){
        return 0;
    }
        int resultxor=0;
        for(int i=0;i<n;i++){
            resultxor=resultxor^nums[i];
        }
        if(resultxor==0){
            return (n-1);
        }
return n;
    }
}