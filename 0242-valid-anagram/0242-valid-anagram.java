class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m){
            return false;
        }
        int arr1[]=new  int[26];
        int arr2[]=new int[26];
        for(int i=0;i<n;i++){
            arr1[s.charAt(i)-'a']++;
            arr2[t.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            int val=s.charAt(i)-'a';
            arr1[val]--;
            arr2[val]--;
        }
        return Arrays.equals(arr1,arr2);
        
        
    }
}