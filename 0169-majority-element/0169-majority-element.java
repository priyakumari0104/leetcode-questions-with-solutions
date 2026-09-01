class Solution {
    public int majorityElement(int[] arr) {
       int n=arr.length;
      int ele=-1;
      int count=0;
      for(int i=0;i<n;i++){
        if(count==0){
            count=1;
            ele=arr[i];
        }else if(arr[i]==ele){
            count++;
        }else{
            count--;
        }
      }
int count1=0;
for(int i=0;i<n;i++){
    if(arr[i]==ele){
        count1++;
    }
}if(count1>n/2){
    return ele;
}
  return -1;   
    }
}