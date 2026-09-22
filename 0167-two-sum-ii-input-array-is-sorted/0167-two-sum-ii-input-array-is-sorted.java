class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int res=target-nums[i];
            if(map.containsKey(res)){
                int top=map.get(res);
                return new int[]{top+1,i+1};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}