class Solution {
    public static int stoneGameV(int stone[]){
int n=stone.length;
int prefix[]=new int[n+1];
int dp[][]=new int[n+1][n+1];
for(int i=0;i<n;i++){
    prefix[i+1]=prefix[i]+stone[i];
}
for(int row[]:dp){
    Arrays.fill(row,-1);
}
return solve(dp,prefix,1,n);
    }
    public static int solve(int dp[][],int prefix[],int start,int end){
        if(start==end){
            return dp[start][end]=0;
        }
        if(dp[start][end]!=-1){
            return dp[start][end];
        }
        int score=0;
        for(int mid=start;mid<end;mid++){
            int leftsum=prefix[mid]-prefix[start-1];
            int rightsum=prefix[end]-prefix[mid];
            if(leftsum<rightsum){
                score=Math.max(score,leftsum+solve(dp,prefix,start,mid));
            }else if(rightsum<leftsum){
                score=Math.max(score,rightsum+solve(dp,prefix,mid+1,end));
            }else{
                score=Math.max(score,Math.max(leftsum+solve(dp,prefix,start,mid),rightsum+solve(dp,prefix,mid+1,end)));
            }
        }
        return dp[start][end]=score;
    }
}