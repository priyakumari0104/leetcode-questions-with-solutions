class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Character,Integer>map=new HashMap<>();
        int n=s.length();
        int m=p.length();
        if(m>n){
            return new ArrayList<>();
        }
        for(int i=0;i<m;i++){
            char ch=p.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int left=0;
        int right=m;
        String str= s.substring(left,right);
        HashMap<Character,Integer> temp=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            temp.put(ch,temp.getOrDefault(ch,0)+1);
        }
        
        while(right<=n){
           if( map.equals(temp)){
             ans.add(left);
            }
            if(right==n){
                break;
            }
            char le=s.charAt(left);
            char re=s.charAt(right);
            temp.put(le,temp.get(le)-1);
            if(temp.get(le)==0){
                temp.remove(le);
            }
            temp.put(re,temp.getOrDefault(re,0)+1);
            left++;
            right++;

            
        }
        return ans;
    }

    
}