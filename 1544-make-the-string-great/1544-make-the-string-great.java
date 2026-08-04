class Solution {
    public String makeGood(String s) {
        Stack <Character>st=new Stack<>();
        st.push(s.charAt(0));
        
       for(int i=1;i<s.length();i++){
        char ch=s.charAt(i);
         
            if(st.size()>0&&Math.abs(ch-st.peek())==32){
                st.pop();
            }else{
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