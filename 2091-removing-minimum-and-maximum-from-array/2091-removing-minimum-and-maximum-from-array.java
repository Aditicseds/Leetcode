class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1||nums.length==2){
            return nums.length;
        }
        int idx[][]=new int[2][2];
        idx[0][0]=Integer.MAX_VALUE;
        idx[1][0]=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(idx[0][0]>nums[i]){
                idx[0][0]=nums[i];
                idx[0][1]=i;
            }
            if(idx[1][0]<nums[i]){
                idx[1][0]=nums[i];
                idx[1][1]=i;
            }
        }
        int n = nums.length;
        //check both on same side
        int first = Math.max(idx[0][1],idx[1][1])+1;
        int last = n-Math.min(idx[0][1],idx[1][1]);
        //from different sides
        int diff1 = idx[0][1]+1+n-idx[1][1];
        int diff2 = n-idx[0][1]+idx[1][1]+1;
        ans = Math.min(first,Math.min(last,Math.min(diff1,diff2)));
        return ans;

    }
}