class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
         vector<int>l1;
       int n=s.size();
       int m=p.size();
       int freq[26]={0};
       for(int i=0;i<m;i++){
        int val=(int)p[i]-'a';
        freq[val]++;
       }
       string str=s.substr(0,m);
       int temp[26]={0};
       for(int i=0;i<str.size();i++){
        int val=(int)str[i]-'a';
        temp[val]++;
       }
       int left=0;
       int right=m;
       while(right<=n){
        if(equal(temp,temp+26,freq)){
            l1.push_back(left);
        }
        if(right==n){
            break;
        }
        int le=(int)s[left]-'a';
        temp[le]--;
        left++;
        int re=(int)s[right]-'a';
        temp[re]++;
        right++;
       }
       return l1;
    }
};