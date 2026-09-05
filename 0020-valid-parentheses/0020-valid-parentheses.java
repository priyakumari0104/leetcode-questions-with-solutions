class Solution {
 public boolean check(char a,char b){
    if(a=='('&&b==')'){
        return true;
    }else if(a=='['&& b==']'){
        return true;
    }else if(a=='{'&&b=='}'){
        return true;
    }
    return false;
 }
    public boolean isValid(String s) {
 int n=s.length();
 if(n%2!=0){
    return false;
 }
 Stack<Character> st= new Stack<>();
 for(int i=0;i<n;i++){
    char ch=s.charAt(i);
    if(ch=='('||ch=='['||ch=='{'){
      st.push(ch);
    }else{
        if(st.size()==0){
            return false;
        }else{
            char top=st.peek();
            if(check(top,ch)){
                st.pop();
            }else{
                return false;
            }
        }
    }

 }

 return (st.isEmpty());
        }
}