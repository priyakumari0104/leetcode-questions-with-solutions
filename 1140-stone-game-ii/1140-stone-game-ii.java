class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;

        int[] suffix = new int[n + 1];

        // suffix[i] = total stones from i to n-1
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + piles[i];
        }

        int[][] dp = new int[n][n + 1];

        return solve(0, 1, piles, suffix, dp);
    }

    public int solve(int i, int M, int[] piles,
                     int[] suffix, int[][] dp) {

        int n = piles.length;

        if (i >= n) {
            return 0;
        }

        if (dp[i][M] != 0) {
            return dp[i][M];
        }

        int best = 0;

        // Take X stones, where 1 <= X <= 2*M
        for (int X = 1; X <= 2 * M && i + X <= n; X++) {

            // Opponent gets the remaining stones
            int opponent = solve(
                i + X,
                Math.max(M, X),
                piles,
                suffix,
                dp
            );

            // Current player gets total remaining stones
            // minus what opponent can get
            int current = suffix[i] - opponent;

            best = Math.max(best, current);
        }

        return dp[i][M] = best;
    }
}