class Solution {
    public int countSpecialIntegers(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        Map<Integer,Integer> map=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        set.add(nums[0]);
        map.put(nums[0],0);
        for(int i=1;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int idx = map.get(nums[i]);
                if(idx+1!=i) set.remove(nums[i]);
            }
            else{
                set.add(nums[i]);
            }
            map.put(nums[i],i);
           
        }
        return set.size();
    }
}