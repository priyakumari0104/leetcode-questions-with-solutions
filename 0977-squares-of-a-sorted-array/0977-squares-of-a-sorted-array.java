class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int t=nums.length-1;
        int res[]=new int[nums.length];
        while(i<=j){
            int lefts=nums[i]*nums[i];
            int rights=nums[j]*nums[j];
            if(lefts<=rights){
                res[t]=rights;
                t--;
                j--;
            }else{
                res[t]=lefts;
                t--;
                i++;
            }
        }
        return res;
    }
}