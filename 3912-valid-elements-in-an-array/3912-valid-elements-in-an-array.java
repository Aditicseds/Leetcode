class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> l = new ArrayList<>();
        if(nums.length==1){
            l.add(nums[0]);
            return l;
        }
        boolean arr[]=new boolean[nums.length-1];
        Arrays.fill(arr,false);
        l.add(nums[0]);
        int max1=nums[0];
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>max1){
                arr[i]=true;
            }
            max1=Math.max(max1,nums[i]);
        }
        int max2=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>max2){
                arr[i]=true;
            }
            max2=Math.max(max2,nums[i]);
        }
         for(int i=1;i<nums.length-1;i++){
            if(arr[i]){
                l.add(nums[i]);
            }
        }
        
        l.add(nums[nums.length-1]);
        return l;
    }
}