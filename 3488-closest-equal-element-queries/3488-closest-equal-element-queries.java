class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        List<Integer> ans=new ArrayList<>();
        Map<Integer,ArrayList<Integer>> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        for(int i=0;i<queries.length;i++){
            int idx= queries[i];
            int val= nums[idx];
            List<Integer> l=m.get(val);
            if(l.size()==1){
                ans.add(-1);
                continue;
            }    
            int pos=Collections.binarySearch(l,idx);
            int le=(pos==0)?l.get(l.size()-1):l.get(pos-1);
            int ri=(pos==l.size()-1)?l.get(0):l.get(pos+1);
            int d1=Math.abs(idx-le);
            d1=Math.min(d1,nums.length-d1);
            int d2=Math.abs(l.get(pos)-ri);
            d2=Math.min(d2,nums.length-d2);
            ans.add(Math.min(d1,d2));
        }

        return ans;
    }
}