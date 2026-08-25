class Solution {
    public char kthCharacter(int k) {
        StringBuilder st=new StringBuilder("a");
        while(st.length()<k){
            StringBuilder sm=new StringBuilder();
            for(int j=0;j<st.length();j++){
                char ch=st.charAt(j);
                char nextchar=(char)(ch+1);
                sm.append(nextchar);
            }
            st.append(sm);
        }
        char ans=st.charAt(k-1);
        return ans;
        
    }
    
}