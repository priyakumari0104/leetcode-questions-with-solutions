class Solution {
    public boolean isPalindrome(String s) {
int n=s.length();
s=s.toLowerCase();
StringBuilder st=new  StringBuilder();
for(int i=0;i<n;i++){
    char ch=s.charAt(i);
 if(Character.isLetterOrDigit(ch)){
    st.append(ch);
 }
}
int left=0;
int right=st.length()-1;
while(left<=right){
    if(st.charAt(left)!=st.charAt(right)){
        return false;
    }
    left++;
    right--;
}
return true;
    }
}