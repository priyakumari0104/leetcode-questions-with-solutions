class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int n=s1.length();
       int m=s2.length();
       if(n>m){
        return false;
       }
       int freq[]=new int[26];
       for(int i=0;i<n;i++){
        int val=(int)s1.charAt(i)-'a';
        freq[val]++;
       }
      String str=s2.substring(0,n);
      int temp[]=new int[26];
      for(int i=0;i<str.length();i++){
        int val=(int)str.charAt(i)-'a';
        temp[val]++;
      }
      int left=0;
      int right=n;
      while(right<=m){
        if(Arrays.equals(freq,temp)){
            return true;
        }
        if(right==m){
            break;
        }
        int leftval=(int)s2.charAt(left)-'a';
        temp[leftval]--;
        left++;
        
        int val=(int)s2.charAt(right)-'a';
        temp[val]++;
        right++;
        
      }
      return false;
    }
}