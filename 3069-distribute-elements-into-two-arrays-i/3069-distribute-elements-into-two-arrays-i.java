class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<n;i++){
            int s1=arr1.size();
            int s2=arr2.size();
            if(arr1.get(s1-1)>arr2.get(s2-1)){
                arr1.add(nums[i]);
            }else{
                arr2.add(nums[i]);
            }
        }
        int res[]=new int[n];
        int idx=0;
        for(int i=0;i<arr1.size();i++){
            res[idx]=arr1.get(i);
            idx++;
        }
        for(int i=0;i<arr2.size();i++){
            res[idx]=arr2.get(i);
            idx++;
        }
        return res;
    }
}