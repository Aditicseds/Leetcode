class Solution {
    public int findGCD(int[] nums) {
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            a=Math.max(a,nums[i]);
            b=Math.min(b,nums[i]);
        }
        if(a==b)return a;
            while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;  
    }
}