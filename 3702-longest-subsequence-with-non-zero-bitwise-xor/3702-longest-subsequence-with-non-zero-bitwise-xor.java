class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0;
        boolean nonzero=false;
        for(int i=0;i<nums.length;i++){
           xor=xor^nums[i];
           if(nums[i]!=0)nonzero=true;
        }
        if(nonzero==false)return 0;

        if(xor==0)return nums.length-1;
        return nums.length;
    }
}