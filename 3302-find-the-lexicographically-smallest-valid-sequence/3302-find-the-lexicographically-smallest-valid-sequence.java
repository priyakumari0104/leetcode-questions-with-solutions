class Solution {
    public int[] validSequence(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int [] suffix=new int[n+1];
        int j=m-1;
        for(int i=n-1;i>=0;i--){
            suffix[i]=suffix[i+1];
            if(j>=0&& word1.charAt(i)==word2.charAt(j)){
                suffix[i]++;
                j--;
            }
        }
        boolean changed=false;
        List<Integer> ans= new ArrayList<>();
    for(int  i=0;i<n&&ans.size()<m;i++){
        if(word1.charAt(i)==word2.charAt(ans.size())){
            ans.add(i);
        }else if(!changed){
            int remainingword2=m-ans.size()-1;
            if(n-i-1>=remainingword2 && suffix[i+1]>=remainingword2){
                ans.add(i);
                changed=true;
            }
        }
    }
    int ans2[]=new int[m];
    
    if(ans.size()==m){
        for(int i=0;i<m;i++){
            ans2[i]=ans.get(i);
        }
        return ans2;
    }
    return new int[0];
    }
}