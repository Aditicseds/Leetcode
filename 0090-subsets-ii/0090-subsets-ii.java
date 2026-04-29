class Solution {
    List<List<Integer>> a = new ArrayList<>();
     void sol(int [] nums,int i,List<Integer>l){
        a.add(new ArrayList<>(l));
        for(int j=i;j<nums.length;j++){
        if (j > i && nums[j] == nums[j - 1]) continue;
        l.add(nums[j]);
        sol(nums,j+1,l);
        l.remove(l.size()-1);
        
        }

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> l=new ArrayList<>();
        Arrays.sort(nums);
        sol(nums,0,l);
        return a;
    }
}