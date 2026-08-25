class Solution {
    public int totalNumbers(int[] digits) {
        // Set<Integer> ans=new HashSet<>();
        int count=0;
    int freq[]=new int[10];
    for(int num:digits){
        freq[num]++;
    }
    Set<Integer> ans=new HashSet<>();
    solve(0,0,freq,ans);
    return ans.size();
    }
    public void solve(int pos,int number,int freq[],Set<Integer> st){
        if(pos==3){
            st.add(number);
            return;
        }
        for(int i=0;i<=9;i++){
            if(pos==0&&i==0){
                continue;
            }
            if(pos==2&&i%2!=0){
                continue;
            }
            if(freq[i]==0){
                continue;
            }
            freq[i]--;
            solve(pos+1,number*10+i,freq,st);
            freq[i]++;
        }
    }
}