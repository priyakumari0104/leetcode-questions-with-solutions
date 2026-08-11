class Solution {
    public int missingInteger(int[] nums) {
        Set <Integer> st=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
           st.add(nums[i]);
        }
        int sum=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
            }else{
                break;
            }
        }
        while(st.contains(sum)){
            sum++;
        }
        return sum;
    }
}