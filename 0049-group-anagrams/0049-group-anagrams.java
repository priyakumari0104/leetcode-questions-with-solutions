class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,List<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            str=new String(ch);
            if(!map.containsKey(str)){
                map.put(str,new ArrayList<>());
            }
            map.get(str).add(strs[i]);
        }
        for(String keys : map.keySet()){
            ans.add(map.get(keys));
        }
        return ans;
    } 
}