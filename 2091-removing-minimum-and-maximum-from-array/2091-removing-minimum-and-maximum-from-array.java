class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n==1){
            return 1;
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minidx=-1;
        int maxidx=-1;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=Math.max(max,nums[i]);
                maxidx=i;
            }
            if(nums[i]<min){
                min=Math.min(nums[i],min);
                minidx=i;
            }
            }
        
        int left=Math.min(minidx,maxidx);
        int right=Math.max(minidx,maxidx);
        int case1=right+1;
        int case2=n-left;
        int case3=(left+1)+(n-right);
        int ans=Math.min(case1,Math.min(case2,case3));
        return ans;
    }
}