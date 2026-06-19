class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int a = 0;
        for(int i : gain){
            a = a+i;
            ans=Math.max(ans,a);
        }
        return ans;
    }
}