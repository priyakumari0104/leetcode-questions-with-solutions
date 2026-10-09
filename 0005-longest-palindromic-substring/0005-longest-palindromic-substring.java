class Solution { 
    
public int check(String s,int i,int j,int dp[][]){
    if(i>=j){
        return 1;
    }
    if(dp[i][j]!=-1){
        return dp[i][j];
    }
    if(s.charAt(i)!=s.charAt(j)){
        return dp[i][j]=0;
    }
    return dp[i+1][j-1]=check(s,i+1,j-1,dp);
}

    public String longestPalindrome(String s) {
        
        int n=s.length();
        int dp[][]=new int[n][n];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        int maxlen=0;
        int sp=-1;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
               if(check(s,i,j,dp)==1){
                if(maxlen<j-i+1){
                    maxlen=j-i+1;
                    sp=i;
                }
               }
            }
        }
        return s.substring(sp,sp+maxlen);
    }
}