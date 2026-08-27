class Solution {
    public int missingMultiple(int[] nums, int k) {
        Map<Integer,Integer> set=new HashMap<>();
        for(int num:nums){
            set.put(num,1);
        }
        for(int multiple=k;;multiple+=k){
                if(!set.containsKey(multiple))
                    return multiple;
        }
        //  for (int multiple = k; ; multiple += k) {
        //     boolean found = false;

        //     for (int num : nums) {
        //         if (num == multiple) {
        //             found = true;
        //             break;
        //         }
        //     }

        //     if (!found) {
        //         return multiple;
        //     }
        // }
    
    }
}