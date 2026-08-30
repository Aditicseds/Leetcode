class Solution {
    long MOD=1000000007;
    long power(long x, long y) {
        long ans = 1;
        x %= MOD;
        while(y>0){
            if(y%2==1){
                ans=(ans*x)%MOD;
            }
            x=(x*x)%MOD;
            y/=2;
        }

        return ans;
    }
    public int sumDecoded(long[] nums) {
       long sum=0;
       for(long i:nums){
            int width = (int)(i%10);
            long d = i/10;
            String s = Long.toString(d);
            long x = Long.parseLong(s.substring(0,width));
            long y = Long.parseLong(s.substring(width));
            sum = (sum + power(x, y)) % MOD;
        }    
       return (int)sum;
    }

}