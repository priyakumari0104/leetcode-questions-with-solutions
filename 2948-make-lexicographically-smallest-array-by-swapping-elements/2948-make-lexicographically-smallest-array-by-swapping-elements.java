class Solution {
    class Pair{
        int val;
        int idx;
        Pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
    }
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
      ArrayList<Pair> arr=new ArrayList<>();
      for(int i=0;i<n;i++){
        arr.add(new Pair(nums[i],i));
      }
      arr.sort((a,b)->Integer.compare(a.val,b.val));
      int start=0;
      
      while(start<n){
        int end=start;
        while(end+1<arr.size()&&
        arr.get(end+1).val-arr.get(end).val<=limit){
            end++;
        }
        ArrayList<Integer> index=new ArrayList<>();
        for(int i=start;i<=end;i++){
            index.add(arr.get(i).idx);
        }
        Collections.sort(index);
        for(int x=0;x<index.size();x++){
            nums[index.get(x)]=arr.get(start+x).val;
        }
        start=end+1;

      }
        return nums;
    }

}