
class Solution {
     class Pair{
        int first;
        int next;
        Pair(int a,int b){
            this.first=a;
            this.next=b;
        }
    }
    public int[][] merge(int[][] intervals) {
       List<Pair> list= new ArrayList<>();
       Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
       int start=intervals[0][0];
       int end=intervals[0][1];
       int n=intervals.length;
       for(int i=1;i<n;i++){
           if(intervals[i][0]<=end){
            end=Math.max(end,intervals[i][1]);
           }else{
           
            list.add(new Pair(start,end));
            start=intervals[i][0];
             end=intervals[i][1];

           }
       }
       list.add(new Pair(start,end));
       int s=list.size();
       int ans[][]= new int[s][2];
       for(int i=0;i<s;i++){
        ans[i][0]=list.get(i).first;
        ans[i][1]=list.get(i).next;
       }
       return ans;
    }
}