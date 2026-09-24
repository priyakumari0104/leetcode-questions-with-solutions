class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int n=nums.length;
        int count=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int avg=sum/k;
        if(avg>=threshold){
            count++;
        }
        int stidx=0;
        int endidx=k;
        while(endidx<n){
            sum-=nums[stidx];
            stidx++;
            sum+=nums[endidx];
            endidx++;
            int av=sum/k;
            if(av>=threshold){
                count++;
            }
        }
        return count;
    }
}