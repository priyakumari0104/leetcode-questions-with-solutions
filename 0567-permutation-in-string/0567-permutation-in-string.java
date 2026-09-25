class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int left=0;
        int right=left+n;
        int m=s2.length();
        while(right<=m){
            String t1=s2.substring(left,right);
            if(valid(s1,t1)){
                return true;
            }
            left++;
            right++;
        }
        return false;
    }
    public boolean valid(String s,String t){
        int n=s.length();
        int m=t.length();
        if(n!=m){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int j=0;j<n;j++){
            char ch=t.charAt(j);
            if(!map.containsKey(ch)){
                return false;
            }
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0){
                map.remove(ch);
            }
        }
        return map.isEmpty();
    }
}