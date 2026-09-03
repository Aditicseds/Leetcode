class Solution {
    public boolean uniformArray(int[] nums1) {
       List<Integer> odd = new ArrayList<>();
       List<Integer> even = new ArrayList<>();
       int min=Integer.MAX_VALUE;
       for(int n : nums1){
        if(n%2==0){
            even.add(n);
        }
        else{
            odd.add(n);
        }
        min=Math.min(min,n);
       }
       if(odd.size()==0 || even.size()==0)return true;
       return min%2==1;
    }
}