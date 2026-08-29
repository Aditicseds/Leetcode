class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,List<Integer>> l=new HashMap<>();
        int [] cl=nums.clone();
        Arrays.sort(cl);
        int idx=-1;
        for(int i=0;i<cl.length;i++){
          if(i==0||cl[i]-cl[i-1]>limit){
            idx++;
            l.put(idx,new ArrayList<>());
          }
           l.get(idx).add(cl[i]);
           map.put(cl[i],idx);
        }
        Map<Integer,Integer> p=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int index=map.get(nums[i]);
            p.put(index,p.getOrDefault(index,-1)+1);
            int point=p.get(index);
            int first=l.get(index).get(point);
            nums[i]=first;
        }
        return nums;
    }
}