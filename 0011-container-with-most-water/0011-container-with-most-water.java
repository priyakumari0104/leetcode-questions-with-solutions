class Solution {
    public int maxArea(int[] height) {
    int n=height.length;
     int max=0;
     int i=0;   
     int j=n-1;
     while(i<j){
        int area=1;
     if(height[i]<height[j]){
        area=(j-i)*height[i];
        i++;
     }else{
        area=(j-i)*height[j];
        j--;
     }
     max=Math.max(area,max);

     }
     return max;
    }
}