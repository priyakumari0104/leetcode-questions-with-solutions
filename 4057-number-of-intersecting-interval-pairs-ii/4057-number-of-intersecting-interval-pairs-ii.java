class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        PriorityQueue<Integer> q= new PriorityQueue<>();
        long count=0;
        for(int inter[]:intervals){
            int start=inter[0];
            int end=inter[1];
            while(!q.isEmpty()&& q.peek()<start){
                q.remove();
            }
            count+=q.size();
            q.add(end);
        }
        return count;
    }
}