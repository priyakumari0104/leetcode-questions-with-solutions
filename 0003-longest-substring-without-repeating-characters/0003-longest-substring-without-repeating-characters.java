class Solution {
    public int lengthOfLongestSubstring(String s) {
           int n=s.length();
           int max=0;
        HashMap<Character,Integer>map=new HashMap<>();
    int i=0;
    int j=0;
    while(j<n){
        char ch=s.charAt(j);
        map.put(ch,map.getOrDefault(ch,0)+1);
    
            while(map.get(ch)>1){
                char c1=s.charAt(i);
                map.put(c1,map.get(c1)-1);
                i++;
            }
        
        max=Math.max(max,j-i+1);
        j++;
    }
    return max;
    }
}