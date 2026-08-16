class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int count=requests[0];
        int m= requests.length;
        for(int i=0;i<m-1;i++){
            count+=Math.abs(requests[i]-requests[i+1]);
        }
        return count;
    }
}