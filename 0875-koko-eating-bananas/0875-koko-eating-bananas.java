class Solution {
    long getHours(long hour,int mid,int[] piles){
            for(int pile:piles){
                hour=hour+(pile+mid-1)/mid;
            }
            return hour;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int ans=0;
        int n=piles.length;
        ans=0;
        int f=1,l=piles[0];
        for(int pile:piles){
            l=Math.max(l,pile);
        }
        
        while(f<=l){
            int mid=(f+l)/2;
            long hours=getHours(0,mid,piles);
            if(hours<=h){
              l=mid-1;
              ans=mid;
            }
            else {
                f=mid+1;
            }
        }
        return ans;
    }
    
}