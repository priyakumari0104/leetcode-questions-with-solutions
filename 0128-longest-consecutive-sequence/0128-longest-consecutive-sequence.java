class Solution {
    public int longestConsecutive(int[] nums) {
       int n=nums.length;
       int max=0;
       HashMap<Integer,Boolean>map=new HashMap<>();
       for(int num:nums){
        map.put(num,false);
       }
       for(int num :nums){
         int count=1;
         int nextnum=num+1;
         while(map.containsKey(nextnum)&&map.get(nextnum)==false){
            count++;
            map.put(nextnum,true);
            nextnum++;
         }
         int prevnum=num-1;
         while(map.containsKey(prevnum)&&map.get(prevnum)==false){
            count++;
            map.put(prevnum,true);
            prevnum--;
         }
         max=Math.max(max,count);
       }
    return max;
        }
}