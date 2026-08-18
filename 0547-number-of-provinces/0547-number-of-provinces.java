class Solution {
    public  void dfs(int city,List<List<Integer>> adj,boolean visited[]){
    visited[city]=true;
   for(int val:adj.get(city) ){
    if(!visited[val]){
        dfs(val,adj,visited);
    }
   }
}
    public int findCircleNum(int[][] mt) {
int n=mt.length;
List<List<Integer>> adj=new ArrayList<>();
for(int i=0;i<n;i++){
    adj.add(new ArrayList<>());
}
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        if(mt[i][j]==1&& i!=j){
            adj.get(i).add(j);
        }
    }}
    int house=0;
    boolean visited[]=new boolean[n];
    for(int i=0;i<n;i++){
        if(!visited[i]){
house++;
dfs(i,adj,visited);
        }
    }
    return house;
    }
}