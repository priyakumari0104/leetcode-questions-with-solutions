class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n= s.length();
        int count=0;
        
        int j=0;
        int i=0;
        while(j<n){
              if(map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),map.get(s.charAt(j))+1);
              }else{
                map.put(s.charAt(j),1);
              }
              while(map.get(s.charAt(j))>2){
                
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
              }
              count=Math.max(count,j-i+1);
              j++;
        }
        return count;
    }
}