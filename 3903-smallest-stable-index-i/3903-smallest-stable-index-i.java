class Solution {
    public int firstStableIndex(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        Map<Integer,Integer> map2=new HashMap<>();
        int n=nums.length;
        map.put(0,nums[0]);
        map2.put(n-1,nums[n-1]);
        
        int a=nums[0];
        int b=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            a=Math.max(a,nums[i]);
            b=Math.min(b,nums[n-i-1]);
            map.put(i,a);
            map2.put(n-i-1,b);
        }
        int ans=0,idx=-1;
        for(int i=0;i<n;i++){
            if(map.get(i)-map2.get(i)<=k){
                return i;
            }
        }
        return -1;
    }
}