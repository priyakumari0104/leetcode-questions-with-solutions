class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean visit[]=new boolean[n];
        visit[0]=true;
bfs(0,visit,rooms);
for(int i=0;i<visit.length;i++){
    if(visit[i]==false){
        return false;
    }
}
return true;
    }
    public static void bfs(int start,boolean visit[],List<List<Integer>> rooms){
        Queue<Integer>q= new LinkedList<>();
        q.add(start);
        visit[start]=true;
        while(q.size()>0){
            int front= q.remove();
            for(int i=0;i<rooms.get(front).size();i++){
                int nextroom=rooms.get(front).get(i);
                if(visit[nextroom]==false){
                    q.add(nextroom);
                    visit[nextroom]=true;
                }
            }
            
        }

    
    }
}