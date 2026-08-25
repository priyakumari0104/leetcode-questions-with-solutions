class Solution {
    public char kthCharacter(int k) {
        return solve(k);
         }
    public char solve(int k){
if(k==1){
    return 'a';
}
int len=1;
while(len<k){
    len*=2;
}
int half=len/2;
if(k<=half){
     return solve(half);
}else{
    char ch=solve(k-half);
    return (char)('a'+(ch-'a'+1)%26);
}
        
    }
    
}