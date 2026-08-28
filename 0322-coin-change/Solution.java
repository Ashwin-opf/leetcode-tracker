class Solution {
    public int coinChange(int[] co, int a) {
        int[] dp = new int[a + 1];
        Arrays.fill(dp, a + 1);
        dp[0] = 0;
        for (int c : co) {
            for (int i = c; i <= a; i++) {
                dp[i] = Math.min(dp[i], dp[i - c] + 1);
            }
        }
        if (dp[a] > a) {
            return -1;
        } else
            return dp[a];
    }
}