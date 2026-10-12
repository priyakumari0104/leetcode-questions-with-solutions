class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>st=new Stack<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums2.length;
        for(int i=n-1;i>=0;i--){
            while(st.size()!=0&& st.peek()<=nums2[i]){
                st.pop();
            }
            if(st.size()==0){
                map.put(nums2[i],-1);
            }else{
                map.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }
        n=nums1.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}