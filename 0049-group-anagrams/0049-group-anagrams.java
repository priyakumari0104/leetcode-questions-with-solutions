class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>ans=new ArrayList<>();
        HashMap<String,List<String>>map=new HashMap<>();
        int n=strs.length;
        for(int i=0;i<n;i++){
            String s=strs[i];
            char c[]=s.toCharArray();
            Arrays.sort(c);
            String m=new String(c);
            if(!map.containsKey(m)){
                map.put(m,new ArrayList<>());
            }
            map.get(m).add(s);
        }
        for(String s:map.keySet()){
            ans.add(map.get(s));
        }
        return ans;
    }
}