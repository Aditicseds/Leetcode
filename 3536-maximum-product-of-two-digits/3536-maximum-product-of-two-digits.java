class Solution {
    public int maxProduct(int n) {
        int max = 0;
        int min = 0;
        boolean f = false;
        while(n>0){
            int d = n % 10;
            if(max<d){
               min=max;
               max=d;
            }
            else if(min<d){
                min=d;
            }
            n/=10;

        }
        return min*max;
    }
}