class Solution {
    public String lexGreaterPermutation(String s, String target) {
       int n=s.length();
       int count[]=new int[26];
       for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        count[ch-'a']++;
       }
       StringBuilder res=new StringBuilder();
       for(int i=0;i<n;i++){
        int taridx=target.charAt(i)-'a';
        if(count[taridx]>0){
            count[taridx]--;
            if(generate(count,target,i+1)){
               res.append((char)(taridx+'a'));
               continue;
            }
             count[taridx]++;
        }
       
        for(int k=taridx+1;k<26;k++){
            if(count[k]>0){
            
                    res.append((char)(k+'a'));
                    count[k]--;
                 for(int x=0;x<26;x++){
                while(count[x]>0){
                    res.append((char)(x+'a'));
                    count[x]--;
                }
            }
            return res.toString();
            }
           
        }
        return "";
       }
       return "";
    }
    public boolean generate(int []count,String target,int start){
        StringBuilder large=new StringBuilder();
        for(int i=25;i>=0;i--){
            while(count[i]>0){
                large.append((char)(i+'a'));
                count[i]--;
            }
        }
        for(int i=0;i<large.length();i++){
            char ch=large.charAt(i);
            count[ch-'a']++;
        }
        String com=target.substring(start);
        return large.toString().compareTo(com)>0;
    }
}