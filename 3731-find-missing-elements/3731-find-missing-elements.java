class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        int max=0,min=nums[0];
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        int[] arr = new int[max + 1];
        for(int i : nums){
            arr[i]++;
        }

        for(int i=min+1;i<max;i++){
            if(arr[i] == 0)
                l.add(i);
        }
        return l;
    }
}