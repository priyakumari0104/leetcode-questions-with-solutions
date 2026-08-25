class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        Set<Integer> st= new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(nums[i]);
        }
        int i=1;
        while(true){
            int val=k*i;
         if(!st.contains(val)){
            return val;
        
         }
         i++;
        }
    }
}