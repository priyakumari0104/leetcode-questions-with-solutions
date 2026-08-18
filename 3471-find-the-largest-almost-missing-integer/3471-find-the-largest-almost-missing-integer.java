class Solution {
    public int largestInteger(int[] nums, int k) {
    int n=nums.length;
    HashMap<Integer,Integer> map= new HashMap<>();
    int start=0;
    int end= k-1;
    while(end<n){
        HashSet<Integer>st=  new HashSet<>();
        for(int i=start;i<=end;i++){
           st.add(nums[i]);
        }
    int m=st.size();
    for(int val:st){
         map.put(val,map.getOrDefault(val,0)+1);
    }
    start++;
    end++;
    }
    int max= -1;
for(int val:map.keySet()){
    if(map.get(val)==1){
        max=Math.max(max,val);
    }
}
return max;
    }
}