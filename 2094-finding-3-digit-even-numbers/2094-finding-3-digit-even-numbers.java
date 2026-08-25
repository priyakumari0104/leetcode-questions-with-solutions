class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> temp=new HashSet<>();
        int n=digits.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i==j||j==k||k==i){
                        continue;
                    }
                    int number=(digits[i]*100)+(digits[j]*10)+(digits[k]*1);
                     if((number>=100 && number<=999)&&number%2==0){
                        temp.add(number);
                     }
                }
            }
        }
        int x= temp.size();
        int res[]=new int[x];
        int idx=0;
        for(int num:temp){
            res[idx]=num;
            idx++;
        }
        Arrays.sort(res);
        return res;
    }
}