class Solution {
    public int maxDistance(int[] colors) {
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<colors.length-1;i++){
            for(int j=colors.length-1;j>i;j--){
               if(colors[i]!=colors[j]){
                  ans=Math.max(ans,Math.abs(i-j));
                  break;
                }
            }
        }
        return ans;
    }
}