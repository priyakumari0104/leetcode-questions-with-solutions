class Solution {
    public int trap(int[] height) {
int left=0;
int right=height.length-1;
int leftm=0;
int rightm=0;
int total=0;
while(left<right){
     if(height[left]<height[right]){
        leftm=Math.max(leftm,height[left]);
        int water=leftm-height[left];
        total+=water;
        left++;
     }else{
        rightm=Math.max(rightm,height[right]);
        int water=rightm-height[right];
        total+=water;
        right--;
     }}
return total;
    }
}