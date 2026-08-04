class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        int max=0,min=nums[0];
        List<Integer> temp = new ArrayList<>();
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
            temp.add(nums[i]);
        }
        List<Integer> l = new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!temp.contains(i)){
                l.add(i);
            }
        }
        return l;
    }
}