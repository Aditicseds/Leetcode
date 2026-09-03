class Solution {
    public boolean uniformArray(int[] nums1) {
       List<Integer> odd = new ArrayList<>();
       List<Integer> even = new ArrayList<>();
       for(int n : nums1){
        if(n%2==0){
            even.add(n);
        }
        else{
            odd.add(n);
        }
       }
       if(odd.size()==0 || even.size()==0)return true;
       Collections.sort(odd);
        boolean flag = true;
       for(int el : even){
            if(el<odd.get(0)) return false;
       }
       return true;
    }
}