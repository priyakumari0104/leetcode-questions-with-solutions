class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(i,j,word,board,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
     public boolean dfs(int i,int j,String word,char[][] board,int idx){
        if(idx==word.length()){
            return true;
        }
        if(i<0||j<0||i>=board.length||j>=board[0].length){
            return false;
        }
        if(board[i][j]!=word.charAt(idx)){
            return false;
        }
        char temp=board[i][j];
        board[i][j]='$';
        boolean found=dfs(i+1,j,word,board,idx+1)||
        dfs(i,j+1,word,board,idx+1)||
        dfs(i-1,j,word,board,idx+1)||
        dfs(i,j-1,word,board,idx+1);
        board[i][j]=temp;
        return found;
     }
}