class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int n=s.length();
        if(n==0){
            return 0;
        }
        int sign=1;
        int i=0;
        long num=0;
        if(s.charAt(i)=='-'||s.charAt(i)=='+'){
            if(s.charAt(i)=='-'){
                sign=-1;
            }else{
                sign=1;
            }i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))){
       num=num*10+(s.charAt(i)-'0');
       if(sign==1 && num>Integer.MAX_VALUE){
        return Integer.MAX_VALUE;
       }
       if(sign==-1 && -num<Integer.MIN_VALUE){
        return Integer.MIN_VALUE;
       }
       i++;
        }
        return (int) num*sign;
    }
}