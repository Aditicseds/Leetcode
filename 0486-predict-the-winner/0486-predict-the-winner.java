class Solution {
    int solve(int[] nums, int i, int j, Integer[][] dp) {
        if (i == j)
            return nums[i];
        if (dp[i][j] != null)
            return dp[i][j];
        int pickLeft = nums[i] - solve(nums, i + 1, j, dp);
        int pickRight = nums[j] - solve(nums, i, j - 1, dp);
        return dp[i][j] = Math.max(pickLeft, pickRight);
    }
     public boolean predictTheWinner(int[] nums) {
        Integer[][] dp = new Integer[nums.length][nums.length];
        return solve(nums, 0, nums.length - 1, dp) >= 0;
    }
}