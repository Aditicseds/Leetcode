class Solution {
    int min=Integer.MAX_VALUE;
    void find(int n){
        int a=0;
        while(n>0){
            int d=n%10;
            a+=d;
            n/=10;
        }
        min=Math.min(min,a);
    }
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            find(nums[i]);
        }
        return min;
    }
}