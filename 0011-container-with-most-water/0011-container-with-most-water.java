class Solution {
    public int maxArea(int[] height) {
    int n=height.length;
    int max=0;
    int left=0;
    int right=n-1;
    while(left<right){
        int wid=right-left;
        if(height[left]>height[right]){
            int heights=height[right];
            int area=heights*wid;
            max=Math.max(max,area);
            right--;
        }else{
            int heights=height[left];
            int area=heights*wid;
            max=Math.max(max,area);
            left++;
        }
    }
    return max;
    }
}