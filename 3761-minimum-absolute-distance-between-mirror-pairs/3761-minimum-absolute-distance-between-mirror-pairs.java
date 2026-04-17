class Solution {
    int rev(int a){
        int d=0;
        while(a>0){
            d=d*10+(a%10);
            a/=10;
        }
        return d;
    }
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                ans = Math.min(ans, i - map.get(nums[i]));
            }
            map.put(rev(nums[i]), i);
        }
        if(ans==Integer.MAX_VALUE)return -1;
        return ans;
       
    }
}