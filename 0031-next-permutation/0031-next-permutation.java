class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ct=-1;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                ct=i-1;
                break;
            }
        }
        if(ct==-1){
            int left=0;
            int right=n-1;
            while(left<=right){
              int temp=nums[left];
              nums[left]=nums[right];
              nums[right]=temp;
              left++;
              right--;
            }
            return;
        }
        for(int j=n-1;j>ct;j--){
            if(nums[j]>nums[ct]){
                int temp=nums[j];
                nums[j]=nums[ct];
                nums[ct]=temp;
                break;
            }
        }
     ct=ct+1;
     int right=n-1;
     while(ct<=right){
        int temp=nums[ct];
        nums[ct]=nums[right];
        nums[right]=temp;
        ct++;
        right--;
     }
    }

}