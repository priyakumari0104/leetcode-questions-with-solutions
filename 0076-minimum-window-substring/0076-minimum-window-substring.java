class Solution {
    public String minWindow(String s, String t) {
       int n=s.length();
       int m=t.length();
       if(m>n){
        return "";
       }
       HashMap<Character,Integer>map=new HashMap<>();
       for(int i=0;i<m;i++){
        char ch=t.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
       }
       int left=0;
       int right=0;
       int start=0;
       int end=0;
       int count=Integer.MAX_VALUE;
       while(end<n){
        char ch=s.charAt(end);
        if(map.containsKey(ch)){
            if(map.get(ch)>0){
                m--;
            }
            map.put(ch,map.get(ch)-1);
        }
        while(m==0){
            int len=end-start+1;
            if(len<count){
                count=len;
                left=start;
                right=end;
            }
            char le=s.charAt(start);
            if(map.containsKey(le)){
                if(map.get(le)>=0){
                    m++;
                }
                map.put(le,map.get(le)+1);
            }
            start++;
        }
        end++;
       }
       if(count==Integer.MAX_VALUE){
        return "";
       }
       return s.substring(left,right+1);
    }
}