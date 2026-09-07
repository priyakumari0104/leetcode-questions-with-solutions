class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int rem=target-nums[i];
            if(map.containsKey(rem)){
            int fr=map.get(rem);
            return new int[]{fr,i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}