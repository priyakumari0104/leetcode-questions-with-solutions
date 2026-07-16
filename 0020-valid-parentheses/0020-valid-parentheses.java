class Solution {
    public boolean check(char a, char b) {
        if (a == '(' && b == ')')
            return true;
        if (a == '[' && b == ']')
            return true;
        if (a == '{' && b == '}')
            return true;
        return false;
    }

    public boolean isValid(String s) {
        if(s.length()%2!=0){return false;}
        Stack<Character> temp=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                temp.push(ch);
            }else{
                if(temp.isEmpty())
                return false;
            
                char top=temp.peek();
                if(check(top,ch)){temp.pop();}
                else{return false;}
            
                }

        }
        return (temp.isEmpty());
        }
}