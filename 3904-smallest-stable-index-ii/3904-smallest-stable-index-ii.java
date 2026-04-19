class Solution {
    public int firstStableIndex(int[] nums, int k) {
         int [] finalArr = new int[nums.length];
        
        Boolean foundStable = false;
        int min_stable_index = Integer.MAX_VALUE;
        // int min_stable_value = Integer.MAX_VALUE;

        // left to right larger
        int big = nums[0];
        for(int i=0;i<nums.length;i++) {

            if(nums[i] > big){
                big = Math.max(nums[i],big);
            }
            finalArr[i] = big;
        }

        int small = nums[nums.length-1];
        
        for(int j=nums.length-1;j>=0;j--) {

            if(nums[j] < small){
                small = Math.min(nums[j],small);
            }

            
            finalArr[j]-= small;

            if(finalArr[j]<=k){
                foundStable = true;
                min_stable_index = j;
                
            }
        }


        if(foundStable == true){
            return min_stable_index;
        }else{
            return -1;
        }
    }
}