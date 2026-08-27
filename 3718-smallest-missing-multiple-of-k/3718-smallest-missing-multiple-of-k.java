class Solution {
    public int missingMultiple(int[] nums, int k) {
        // Set<Integer> set=new HashSet<>();
        // for(int num:nums){
        //     set.add(num);
        // }
        // for(int multiple=k;;multiple+=k){
        //         if(!set.contains(multiple))
        //             return multiple;
        // }
         for (int multiple = k; ; multiple += k) {
            boolean found = false;

            for (int num : nums) {
                if (num == multiple) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return multiple;
            }
        }
    
    }
}