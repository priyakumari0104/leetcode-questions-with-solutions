class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
    List<List<Integer>> adj= new ArrayList<>();
for(int i=0;i<n;i++){
    adj.add(new ArrayList<>());
}
int x=invocations.length;
for(int i=0;i<x;i++){
    int a=invocations[i][0];
    int b=invocations[i][1];
    adj.get(a).add(b);
    
}
boolean visited[]=new boolean[n];
 List<Integer> ans= new ArrayList<>();
 bfs(visited,k,adj);
 for(int edge[]:invocations){
    int a=edge[0];
    int b=edge[1];
    if(!visited[a]&&visited[b]){
        List<Integer>all=new ArrayList<>();
        for(int i=0;i<n;i++){
            all.add(i);
        }
        return all;
    }
 }
 for(int i=0;i<n;i++){
    if(visited[i]==false){
        ans.add(i);
    }
 }
 return ans;
     }
     public void bfs(boolean visited[],int node,List<List<Integer>> adj){
        Queue<Integer>q=new LinkedList<>();
        visited[node]=true;
        q.add(node);
        while(q.size()>0){
            int val=q.remove();
            for(int next:adj.get(val)){
                if(visited[next]==false){
                    visited[next]=true;
                    q.add(next);
                }
            }
        }
        
     }
}