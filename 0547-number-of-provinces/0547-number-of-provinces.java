class Solution {
    public int findCircleNum(int[][] mt) {
        int n = mt.length;
        int count = 0;
        boolean visit[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visit[i] == false) {
                bfs(i, mt, visit);
                count++;
            }
        }
        return count;
    }

    public static void bfs(int i, int mt[][], boolean visit[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visit[i] = true;
        int n = mt.length;

        while (q.size() > 0) {
            int front = q.remove();
            for (int j = 0; j < n; j++) {
                if (mt[front][j] == 1 && visit[j] == false){
                    q.add(j);
                visit[j] = true;}
            }
        }
    }
}