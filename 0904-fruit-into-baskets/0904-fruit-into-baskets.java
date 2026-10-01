class Solution {
    public int totalFruit(int[] nums) {
int n=nums.length;
int count=0;
HashMap<Integer,Integer> map=new HashMap<>();
int left=0;
int right=0;
int max=0;

while(right<n){
   map.put(nums[right],map.getOrDefault(nums[right],0)+1);
   right++;
   while(map.size()>2){
    map.put(nums[left],map.get(nums[left])-1);
    if(map.get(nums[left])==0){
        map.remove(nums[left]);
    }
    left++;
   }
max=right-left;
count=Math.max(max,count);
}
return count;
    }
}