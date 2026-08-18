class Solution {
    public int largestInteger(int[] nums, int k) {
        int cnt1=0, cnt2=0;
        int f[]=new int[51];
        int ans=-1;
        int max=Math.max(nums[0],nums[nums.length-1]);
        for(int i=0;i<nums.length;i++){
            f[nums[i]]++;
            max=Math.max(max,nums[i]);

        }
        for(int i=0;i<nums.length;i++){
            if(f[nums[i]]==1){
                if(ans<nums[i]){
                    ans=nums[i];
                }
            }
        }
        if(k==nums.length) return max;
        if(k==1) return ans;
        else{
        if(f[nums[nums.length-1]]==1 && f[nums[0]]==1)
            return Math.max(nums[0],nums[nums.length-1]);
        if(f[nums[0]]==1) return nums[0];
        if(f[nums[nums.length-1]]==1) return nums[nums.length-1];
        
        }
        return -1;
    }
        //     for(int i=0;i<nums.length;i++){
        //     if(f[nums[i]]==1){
        //         if(ans<nums[i]){
        //             ans=nums[i];
        //         }
        //     }
        // }
}