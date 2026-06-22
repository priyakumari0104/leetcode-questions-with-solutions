class Solution { 
   public static boolean solve(String s,int i,int j){
    while(i<j){
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        i++;
        j--;
    }
    return true;
}
    public String longestPalindrome(String s) {
        int n=s.length();
        int maxlen=0;
        int sp=-1;
        for(int i=0;i<n;i++){
          for(int j=i;j<n;j++){
            if(solve(s,i,j)==true){
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