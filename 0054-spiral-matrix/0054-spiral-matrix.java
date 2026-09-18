class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      List<Integer>ans= new ArrayList<>();
      int m=matrix.length;
      int n=matrix[0].length;
      int top=0;
      int left=0;
      int right=n-1;
      int bottom=m-1;
      while(left<=right&& top<=bottom){
        for(int i=left;i<=right;i++){
            ans.add(matrix[top][i]);
        }
        top++;
        for(int j=top;j<=bottom;j++){
            ans.add(matrix[j][right]);
        }
        right--;
        if(top<=bottom){
            for(int i=right;i>=left;i--){
                ans.add(matrix[bottom][i]);
            }
        }
        bottom--;
        if(left<=right){
            for(int j=bottom;j>=top;j-- ){
                ans.add(matrix[j][left]);
            }
        }
    left++;
      }
      return ans;
    }
}