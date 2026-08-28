class Solution {
    public int change(int a, int[] c) {
        int[] dp = new int[a + 1];
        dp[0] = 1;
        for (int co : c) {
            for (int am = co; am <= a; am++) {
                dp[am] += dp[am - co];
            }
        }
        return dp[a];
    }
}