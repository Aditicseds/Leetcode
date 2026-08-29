class Solution {
    int solve(int[]nums, int target,int[]dp){
        if(target==0){
            return 1;
        }
        if(target<0){
            return 0;
        }
        if(dp[target]!=-1){
            return dp[target];
        }
        int count=0;
        for(int n:nums){
            count+=solve(nums,target-n,dp);
        }
         dp[target]=count;
        return dp[target];
    }
    public int combinationSum4(int[] nums, int target) {
    int dp[]=new int[target+1];
    Arrays.fill(dp,-1);
    solve(nums,target,dp);
    return dp[target];
    
    }
}