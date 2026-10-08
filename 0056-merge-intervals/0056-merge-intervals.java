
class Solution {
class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
    public int[][] merge(int[][] nums) {
        List<Pair>list=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums,(a,b)->Integer.compare(a[0],b[0]));
        int start=nums[0][0];
        int end=nums[0][1];
        for(int i=0;i<n;i++){
            if(nums[i][0]<=end){
                end=Math.max(nums[i][1],end);
            }else{
                list.add(new Pair(start,end));
                start=nums[i][0];
                end=nums[i][1];
            }
        }
        list.add(new Pair(start,end));
        n=list.size();
        int ans[][]=new int[n][2];
        for(int i=0;i<n;i++){
            ans[i][0]=list.get(i).first;
            ans[i][1]=list.get(i).second;
        }
        return ans;
    }
}