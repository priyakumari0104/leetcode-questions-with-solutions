class Solution {
    public int minLength(String s) {
        Stack<Character> st= new Stack();
        st.push(s.charAt(0));
        for(int  i=1;i<s.length();i++){
            char ch=s.charAt(i);
            
                if(st.size()>0&&(ch=='B'&&st.peek()=='A'||ch=='D'&&st.peek()=='C')){
                    st.pop();
                    
                }else if(ch=='s'){
                    continue;
                }
                else{
                    st.push(ch);
                }
                
            
        }
        return st.size();
    }
}