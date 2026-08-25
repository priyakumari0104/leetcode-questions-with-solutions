class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> ans=new HashSet<>();
        HashMap<Integer, Integer> map=new HashMap<>();
        int n=digits.length;
        for(int i=0;i<n;i++){
            int val=digits[i];
            if(map.containsKey(val)){
              map.put(val,map.get(val)+1);
            }else{
                map.put(val,1);
            }
        }
        for(int i=1;i<=9;i++){
            if(!map.containsKey(i)){
                continue;
            }
            for(int j=0;j<=9;j++){
                if(!map.containsKey(j)){
                    continue;
                }
                for(int k=0;k<=8;k+=2){
                    if(!map.containsKey(k)){
                        continue;
                    }
                    int ci=map.get(i);
                    int cj=map.get(j);
                    int ck=map.get(k);
                    boolean avail=false;
                    if(i==j&&j==k){
                       avail=ci>=3;
                    }else if(i==j){
                        avail=ci>=2&&ck>=1;
                    }else if(j==k){
                        avail=cj>=2&&ci>=1;
                    }else if(i==k){
                        avail=ci>=2&&cj>=1;
                    }
                    else{
                        avail=ci>=1&&cj>=1&&ck>=1;
                    }
                    if(avail==true){
                        int number=i*100+j*10+k;
                        if(number%2==0){
                            ans.add(number);
                        }
                    }
                }
            }
        }
int x=ans.size();
return x;
    }
}