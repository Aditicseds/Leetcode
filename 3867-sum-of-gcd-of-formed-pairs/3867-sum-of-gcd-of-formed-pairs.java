class Solution {
    int gcd(int a, int b) { 
         while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
        }
    public long gcdSum(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            nums[i] = gcd(nums[i], max);
        }
        Arrays.sort(nums);
        long res = 0;        
        for (int i = 0, j = nums.length - 1; i < j; i++, j--)
            res += gcd(nums[i], nums[j]);

        return res; 
    }
}