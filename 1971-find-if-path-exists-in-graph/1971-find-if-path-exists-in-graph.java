class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) {
            return true;
        }
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            adj.add(list);
        }
        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        boolean visit[] = new boolean[n];
        visit[source] = true;
        bfs(source, destination, visit, adj);
        if (visit[destination] == false) {
            return false;
        }
        return true;

    }

    public static void bfs(int source, int destination, boolean visit[], List<List<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        visit[source] = true;
        q.add(source);
        while (q.size() > 0) {
            int front = q.remove();
            for (int i = 0; i < adj.get(front).size(); i++) {
                int nextele=adj.get(front).get(i);
                if(visit[nextele]==false){
                    visit[nextele]=true;
                    q.add(nextele);
                }
            }
        }
    }
}