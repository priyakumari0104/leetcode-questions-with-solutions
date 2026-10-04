class Solution {
    public boolean check(char a,char b){
        if(a=='('&&b==')'){
            return true;
        }else if(a=='{'&&b=='}'){
            return true;
        }else if(a=='['&&b==']'){
            return true;
        }
        return false;
    }
public boolean isValid(String s) {
  Stack<Character>st=new Stack<>();
  int n=s.length();
  for(int i=0;i<n;i++){
    char ch=s.charAt(i);
   if(st.size()==0){
    if(ch=='}'||ch==']'||ch==')'){
        return false;
    }else{
        st.push(ch);
    }
   }else{
    char top=st.peek();
     if(check(top,ch)){
        st.pop();
     }else{
       st.push(ch);
     }
     
   }
   
    
  }
  return st.isEmpty();
        }
}