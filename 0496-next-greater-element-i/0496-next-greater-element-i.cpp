class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        stack<int>st;
        unordered_map<int,int>map;
        int n=nums2.size();
        for(int i=n-1;i>=0;i--){
            while(!st.empty()&&st.top()<=nums2[i]){
                st.pop();
            }
            if(st.size()==0){
                map[nums2[i]]=-1;
            }else{
                map[nums2[i]]=st.top();
            }
            st.push(nums2[i]);
        }
        n=nums1.size();
        vector<int>ans;
        for(int i=0;i<n;i++){
            ans.push_back(map[nums1[i]]);
        }
        return ans;
    }
};