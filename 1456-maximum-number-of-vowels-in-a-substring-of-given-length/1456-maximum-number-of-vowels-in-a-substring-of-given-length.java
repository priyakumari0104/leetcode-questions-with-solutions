class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int max=findvowel(s,0,k);
        int stidx=0;
        int endidx=k;
        int cout=max;
        while(endidx<n){
            char ch=s.charAt(stidx);
            char en=s.charAt(endidx);
            
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                cout--;
            }
             if(en=='a'||en=='e'||en=='i'||en=='o'||en=='u'){
                cout++;
            }
            max=Math.max(max,cout);
            stidx++;
            endidx++;
        }
        return max;
    }
    public int findvowel(String s,int st,int end){
        int count=0;
        for(int i=st;i<end;i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    }
}