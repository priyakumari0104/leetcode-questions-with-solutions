class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
List<List<String>> ans= new ArrayList<>();
HashMap<String,List<String>> map= new HashMap<>();
for(int i=0;i<strs.length;i++){
    String s1=strs[i];
    char ch[]= s1.toCharArray();
    Arrays.sort(ch);
    String st=new String(ch);
    if(!map.containsKey(st)){
        map.put(st,new ArrayList<>());
    }
    map.get(st).add(strs[i]);
}
for(String key: map.keySet()){
    ans.add(map.get(key));
}
return ans;
    } 
}