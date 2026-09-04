class Solution {
    public int firstStableIndex(int[] nums, int k) {
      int min[]  = new int[nums.length];
      min[nums.length-1]=nums[nums.length-1];
      int mini = nums[nums.length-1];
      for(int i=nums.length-2;i>=0;i--){
        mini=Math.min(mini,nums[i]);
        min[i]=mini;
      }
      int max=-2;
      for(int i=0;i<nums.length;i++){
        max=Math.max(max,nums[i]);
        if(max-min[i]<k || max-min[i]==k){
            return i;
        }
      }
      return -1;
    }
}