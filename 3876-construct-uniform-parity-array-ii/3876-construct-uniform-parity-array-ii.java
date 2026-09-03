class Solution {
    public boolean uniformArray(int[] nums1) {
       boolean even = true;
       int min=Integer.MAX_VALUE;
       for(int n : nums1){
        if(n%2!=0) even = false;
        min=Math.min(min,n);
       }
        if(min%2==1){
            return true;
        }
       return min%2==1 || even;
    }
}