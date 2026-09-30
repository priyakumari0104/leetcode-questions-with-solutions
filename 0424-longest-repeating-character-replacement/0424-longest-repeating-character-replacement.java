class Solution {
    public int characterReplacement(String s, int k) {
       int n=s.length();
       int freq[]=new int[26];
       int left=0;
       int right=0;
       int ans=0;
       int maxfreq=0;
       while(right<n){
        int val=(int)s.charAt(right)-'A';
        freq[val]++;
        maxfreq=Math.max(maxfreq,freq[val]);
        int winsize=right-left+1;
        int change=winsize-maxfreq;
        if(change<=k){
            ans=Math.max(ans,winsize);
        }
        if(change>k){
            int v=(int)s.charAt(left)-'A';
            freq[v]--;
            left++;
        }
        right++;
       } 
       return  ans;
    }
}