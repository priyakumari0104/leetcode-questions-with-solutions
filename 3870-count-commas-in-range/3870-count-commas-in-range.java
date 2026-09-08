class Solution {
    public int countCommas(int n) {
        if(n<1000){
            return 0;
        }
        int comma=1;
        if(n>=1000){
          int num=1000;
           while(num!=n){
            comma++;
            num++;
           }
        }
        return comma;
    }

}