class Solution {
    List<Integer> curr;
    List<List<Integer>> res=new ArrayList<>();
    void solve(List<Integer> curr,int idx,int nums[],int k){
        if(curr.size()!=0){
        res.add(new ArrayList<>(curr));
        }
        for(int i=idx;i<nums.length;i++){
            if(curr.contains(nums[i]+k) || curr.contains(nums[i]-k)){
            continue;
        }
            curr.add(nums[i]);
            solve(curr,i+1,nums,k);
            curr.remove(curr.size()-1);
        }
    }
    public int beautifulSubsets(int[] nums, int k) {
        curr=new ArrayList<>();
        solve(curr,0,nums,k);
        return res.size();
    }
}