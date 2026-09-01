class Solution {
    public double myPow(double x, int n) {
      double pow=n;
      if(n<0){
        x=1/x;
        pow=-pow;
      }
      return solve(x,n);
    }
    public double solve(double x,int pow){
        if(pow==0){
            return 1;
        }
        double half=solve(x,pow/2);
        if(pow%2==0){
            return half*half;
        }else{
            return half*half*x;
        }
        
    }
}