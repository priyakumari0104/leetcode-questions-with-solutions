class Solution {
    public int[] findEvenNumbers(int[] digits) {
    int freq[]=new int[10];
    for(int val:digits){
        freq[val]++;
    }
    Set<Integer>st=new HashSet<>();
    solve(0,0,freq,st);
    int x=st.size();
    int ans[]=new int[x];
    int idx=0;
    for(int val:st){
        ans[idx]=val;
        idx++;
    }
    Arrays.sort(ans);
    return ans;
    }
    public void solve(int pos,int number,int freq[],Set<Integer>st){
        if(pos==3){
            st.add(number);
            return;
        }
        for(int i=0;i<=9;i++){
            if(pos==0&&i==0){
                continue;
            }if(pos==2&&i%2!=0){
                continue;
            }if(freq[i]==0){
                continue;
            }
            freq[i]--;
            solve(pos+1,number*10+i,freq,st);
            freq[i]++;
        }
    }
}