class Solution {
    public double findMaxAverage(int[] nums, int k) {
int n=nums.length;
int sum=0;
for(int i=0;i<k;i++){
    sum+=nums[i];
}
int max=sum;
int stidx=0;
int endidx=k;
while(endidx<n){
    sum-=nums[stidx];
    stidx++;
    sum+=nums[endidx];
    endidx++;
    max=Math.max(max,sum);
}
return (double)max/k;
    }
}