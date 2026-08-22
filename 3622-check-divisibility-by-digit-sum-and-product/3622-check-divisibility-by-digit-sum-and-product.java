class Solution {
    public boolean checkDivisibility(int n) {
        int x=n;
        int sum=0;
        int product=1;
        while(x>0){
            int digit=x%10;
            x=x/10;
sum+=digit;
product*=digit;

        }
        int div=sum+product;
        if(n%div==0){
            return true;
        }
return false;
    }
}