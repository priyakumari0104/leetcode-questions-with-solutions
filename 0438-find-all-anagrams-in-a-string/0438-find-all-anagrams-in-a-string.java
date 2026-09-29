class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
       int n=s.length();
       int m=p.length();
       if(m>n){
        return new ArrayList<>();
       }
       int freq[]=new  int[26];
       for(int i=0;i<m;i++){
        int val=(int)p.charAt(i)-'a';
        freq[val]++;
       }
       String str=s.substring(0,m);
       int temp[]=new int[26];
       for(int i=0;i<str.length();i++){
        int val=(int)s.charAt(i)-'a';
        temp[val]++;
       }
       int left=0;
       int right=m;
       while(right<=n){
         if(Arrays.equals(temp,freq)){
            ans.add(left);
         }
         if(right==n){
            break;
         }
         int val=(int)s.charAt(right)-'a';
         temp[val]++;
         right++;
         int le=(int)s.charAt(left)-'a';
         temp[le]--;
         left++;
       }
        return ans;
    }  
}