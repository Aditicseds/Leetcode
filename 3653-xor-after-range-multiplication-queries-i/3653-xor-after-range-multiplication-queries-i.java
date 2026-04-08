class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int [] q:queries){
            int f=q[0];
            int l=q[1];
            int add=q[2];
            int mul=q[3];
            for(int i=f;i<=l;i+=add){
               nums[i] = (int)((1L * nums[i] * mul)%(1000000007));
            }
        }
        int xor=0;
        for(int i=0;i<nums.length;i++){
           xor^=nums[i];
        }
        return xor;
    }
}