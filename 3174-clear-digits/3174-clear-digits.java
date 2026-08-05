class Solution {
    public String clearDigits(String s) {
        Stack<Character> st= new Stack();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.size()>0){
                if(Character.isDigit(ch)&& !Character.isDigit(st.peek())){
                    st.pop();
                }
            }
            if(!Character.isDigit(ch)){
                st.push(ch);
            }
        }
        StringBuilder sm= new StringBuilder();
        while(st.size()>0){
            sm.append(st.pop());
        }
        return sm.reverse().toString();
    }
}