class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int i=0;
        int j=0;
        int k=0;
        int ans[]=new int[m+n];
        while(i<n && j<m){
             if(nums1[i]<=nums2[j]){
                ans[k]=nums1[i];
                i++;
                k++;
             }else if(nums2[j]<=nums1[i]){
                ans[k]=nums2[j];
                j++;
                k++;
             }
        }
        while(i<n){
            ans[k]=nums1[i];
            i++;
            k++;
        }
        while(j<m){
            ans[k]=nums2[j];
            j++;
            k++;
        }
        int total=n+m;
       if(total%2==0){
        return(ans[total/2]+ans[(total-1)/2])/2.0;
       }
       return(ans[total/2]);
    }
}