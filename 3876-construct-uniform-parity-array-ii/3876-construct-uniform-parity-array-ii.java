class Solution {
    public boolean uniformArray(int[] nums) {
    int n=nums.length;
    int minOdd=Integer.MAX_VALUE;
    int minEven=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
        if(nums[i]%2==0){
            minEven=Math.min(minEven,nums[i]);
        }else{
            minOdd=Math.min(minOdd,nums[i]);
        }
    }    
    if(minEven==Integer.MAX_VALUE||minOdd==Integer.MAX_VALUE){
        return true;
    }
    return minOdd<minEven;
    }
}