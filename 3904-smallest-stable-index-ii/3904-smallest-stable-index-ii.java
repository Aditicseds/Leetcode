class Solution {
    public int firstStableIndex(int[] nums, int k) {
         int n=nums.length;
        int[] pre=new int[n];
        int[] suf=new int[n];
        pre[0]=nums[0];
        suf[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            pre[i]=Math.max(pre[i-1],nums[i]);
            suf[n-i-1]=Math.min(suf[n-i],nums[n-i-1]);
        }
       
        for(int i=0;i<n;i++){
            int diff=pre[i]-suf[i];
            if(diff<=k){
                return i;
            }
        }
        return -1;
    }
}