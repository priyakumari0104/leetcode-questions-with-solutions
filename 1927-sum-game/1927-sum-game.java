class Solution {
    public boolean sumGame(String num) {

       int n=num.length();
       int half=n/2;
       int leftsum=0;
       int rightsum=0;
       int leftq=0;
       int rightq=0;
       for(int i=0;i<half;i++){
        char ch= num.charAt(i);
        if(ch=='?'){
            leftq++;
        }else{
            leftsum+=ch-'0';
        }
       }
       for(int i=half;i<n;i++){
        char ch=num.charAt(i);
        if(ch=='?'){
            rightq++;
        }else{
            rightsum+=ch-'0';
        }
       }
       if((leftq+rightq)%2==1){
        return true;
       }
       return rightsum-leftsum!=9*(leftq-rightq)/2;
    }
}