class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        solve(0,arr,target,ans,temp);
        return ans;
    }
    public void solve(int index,int arr[],int target,List<List<Integer>> ans,List<Integer> temp){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }if(index==arr.length){
            return;
        }
        if(target>=arr[index]){
            temp.add(arr[index]);
            solve(index,arr,target-arr[index],ans,temp);
            temp.remove(temp.size()-1);
        }
        solve(index+1,arr,target,ans,temp);
    }
}