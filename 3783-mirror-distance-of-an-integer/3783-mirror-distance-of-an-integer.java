class Solution {
    int rev(int n){
        int d=0;
        while(n>0){
            d=d*10+(n%10);
            n/=10;
        }
        return d;
    }
    public int mirrorDistance(int n) {
        int r=rev(n);
        return Math.abs(n-r);
    }
}