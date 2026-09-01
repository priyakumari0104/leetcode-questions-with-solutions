class Solution {
    public List<Integer> majorityElement(int[] nums) {
         List<Integer> res= new ArrayList<>();
         int n= nums.length;
    int ele1=Integer.MAX_VALUE;
    int ele2=Integer.MAX_VALUE;
    int cnt1=0;
    int cnt2=0;
    for(int i=0;i<n;i++){
        int curr=nums[i];
        if(curr==ele1){
            cnt1++;
        }else if(curr==ele2){
            cnt2++;
        }else if(cnt1==0){
            ele1=curr;
            cnt1++;
        }else if(cnt2==0){
            ele2=curr;
            cnt2++;
        }else{
            cnt1--;
            cnt2--;
        }
    }
         cnt1=0;
         cnt2=0;
        for(int val:nums){
            if(val==ele1){
                cnt1++;
            }if(val==ele2){
                cnt2++;
            }
        }
        if(cnt1>n/3){
            res.add(ele1);
        }if(cnt2>n/3){
            res.add(ele2);
        }
        return res;
    }
}