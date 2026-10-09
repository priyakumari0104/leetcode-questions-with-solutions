class Solution { 
public boolean check(String s,int i,int j){
    if(i>j){
        return false;
    }
    while(i<j){
        if(s.charAt(i)==s.charAt(j)){
            i++;
            j--;
        }else{
            return false;
        }
 }
 return true;
}

    public String longestPalindrome(String s) {
        int n=s.length();
        int maxlen=0;
        int sp=-1;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
               if(check(s,i,j)){
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