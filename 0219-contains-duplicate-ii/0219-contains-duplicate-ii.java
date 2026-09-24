class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
       Set<Integer>map=new HashSet<>();
       for(int i=0;i<n;i++){
        if(map.contains(nums[i])){
            return true;
        }
        map.add(nums[i]);
        if(map.size()>k){
            map.remove(nums[i-k]);
        }
       }
       return false;
    }
}