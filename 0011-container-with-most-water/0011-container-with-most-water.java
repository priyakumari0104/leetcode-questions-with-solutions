class Solution {
    public int maxArea(int[] height) {
    int max=0;
    int left=0;
    int right=height.length-1;
    while(left<right){
        if(height[left]<height[right]){
            int wid=(right-left);
            int area=wid*height[left];
            max=Math.max(max,area);
            left++;
        }else{
            int wid=(right-left);
            int area=wid*height[right];
            max=Math.max(area,max);
            right--;
        }
    }
    return max;
    }
}