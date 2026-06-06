class Solution {
    public int[] leftRightDifference(int[] nums) {
       int total = 0, ans[] = new int[nums.length];
       for(int i=0;i<nums.length;i++){
           total+=nums[i];
       }
       int left=0,leftsum=0,right=0;
       for(int i=0;i<nums.length;i++){
           leftsum+=nums[i];
           right=total-leftsum;
           left=leftsum-nums[i];
           ans[i]=Math.abs(left-right);
       }
        return ans;
    }
}