class Solution {
    public int count(int coins[], int sum) {
        // code here.
        int[] dp = new int[sum + 1];
        dp[0] = 1;
        for(int c : coins) {
            for(int i = c; i <= sum; i++) dp[i] += dp[i - c];
        }
        return dp[sum];
    }
}