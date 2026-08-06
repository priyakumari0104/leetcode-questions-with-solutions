class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int prd=1;
            for(int j=i+1;j<nums.length;j++){
                prd=(nums[i]-1)*(nums[j]-1);
                max=Math.max(prd,max);
            }
        }
        return max;
    }
}