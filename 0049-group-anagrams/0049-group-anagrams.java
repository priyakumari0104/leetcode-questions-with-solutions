class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans= new ArrayList<>();
        int n=strs.length;
    boolean used[]=new boolean[n];
    for(int i=0;i<n;i++){
        if(used[i])continue;
        used[i]=true;
        List<String>temp=new ArrayList<>();
        temp.add(strs[i]);
        for(int j=i+1;j<n;j++){
            if(used[j]!=true){
                if(valid(strs[i],strs[j])){
                    temp.add(strs[j]);
                     used[j]=true;
                    
                }
            }
        }
        ans.add(temp);
    }
        
        
        return ans;
    }
    public  static boolean valid(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            int n1=s.charAt(i)-'a';
            int n2=t.charAt(i)-'a';
            freq[n1]++;
            freq[n2]--;
        }
        for(int x:freq){
            if(x!=0){
                return false;
            }
        }
        return true;
    } 
}