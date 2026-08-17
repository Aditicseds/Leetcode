class Solution {
    List<List<Integer>> ans= new ArrayList<>();
    void bt(int nums[],int idx,List<Integer> curr){
        if(curr.size()>=2){
            ans.add(new ArrayList(curr));
        }
        Set<Integer> used=new HashSet<>();
        for(int i=idx;i<nums.length;i++){
            if(!curr.isEmpty() && nums[i]<curr.get(curr.size()-1)){
                continue;
            }
            if(used.contains(nums[i])){
                continue;
            }
            used.add(nums[i]);
            curr.add(nums[i]);
            bt(nums,i+1,curr);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> curr=new ArrayList<>();
        bt(nums,0,curr);
        return ans;
        
    }
}