class Solution {
    int gcd(int a,int b){
        while(b>0){
           int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long maxPairStrength(int[] nums) {
         long mx = 0; 
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                long nu = ((long)nums[i] * (long)nums[j]); 
                long de = gcd(nums[i], nums[j]); 
                de *= de; 

                mx = Math.max(mx, nu / de); 
            }
        }
        return mx; 
    }
}