class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int a =1;
        for(int i=1;;i++){
            a=k*i;
           if(!set.contains(a)){
              return a;
           }
        }
    
    }
}