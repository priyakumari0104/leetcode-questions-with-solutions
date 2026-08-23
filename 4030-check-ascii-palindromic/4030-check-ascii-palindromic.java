class Solution {
    public boolean isPalindromic(String s) {
       int n=s.length();
       String s1="";
       for(int i=0;i<n;i++){
     char ch=s.charAt(i);
     int num=(int)ch;
     String bn=String.format("%8s",Integer.toBinaryString(num)).replace(' ','0');
     s1+=bn;
       }
int left=0;
int right=s1.length()-1;
while(left<=right){
    if(s1.charAt(left)!=s1.charAt(right)){
        return false;
    }
    left++;
    right--;
}
return true;
    }
}