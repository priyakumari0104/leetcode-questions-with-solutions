class Solution {
    public int largestRectangleArea(int[] arr) {
       Stack<Integer>st=new Stack<>();
       int n=arr.length;
       int leftmin[]=new int[n];
       int rightmin[]=new int[n];
       for(int i=n-1;i>=0;i--){
        while(st.size()!=0&&arr[st.peek()]>=arr[i]){
            st.pop();
        }
        if(st.size()==0){
            rightmin[i]=n;
        }else{
            rightmin[i]=st.peek();
        }
        st.push(i);
       }
       st=new Stack<>();
       for(int i=0;i<n;i++){
        while(st.size()!=0&&arr[st.peek()]>=arr[i]){
            st.pop();
        }
        if(st.size()==0){
            leftmin[i]=-1;
        }else{
            leftmin[i]=st.peek();
        }
        st.push(i);
       }
       int max=0;
       for(int i=0;i<n;i++){
        int wid=rightmin[i]-leftmin[i]-1;
        int area=arr[i]*wid;
        max=Math.max(area,max);
       }
    return max;
    }
}