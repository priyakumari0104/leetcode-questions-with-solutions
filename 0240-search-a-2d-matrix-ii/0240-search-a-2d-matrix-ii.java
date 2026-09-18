class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int m=matrix.length;
      int n=matrix[0].length;
      int top=0;
      int left=0;
      int right=n-1;
      int bottom=m-1;
      while(top<=bottom){
        while(left<=right){
        int mid=(left+right)/2;
        if(matrix[top][mid]==target){
            return true;
        }else if(matrix[top][mid]>target){
            right=mid-1;
        }else{
            left=mid+1;
        }
        }
        top++;
        left=0;
        right=n-1;
      } 
      return false;
    }
}