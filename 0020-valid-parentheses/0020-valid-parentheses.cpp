class Solution {
public:
bool check(char a,char b){
    if(a=='('&&b==')'){
        return true;
    }else if(a=='{'&&b=='}'){
        return true;
    }else if(a=='['&&b==']'){
        return true;
    }
    return false;
}
    bool isValid(string s) {
        stack<char>st;
        int n=s.size();
        for(int i=0;i<n;i++){
            char ch=s[i];
            if(st.size()==0){
                if(ch=='}'||ch==']'||ch==')'){
                    return false;
                }else{
                    st.push(ch);
                }
            }else{
                char top=st.top();
                if(check(top,ch)){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }
        }
        return st.empty();
    }
};