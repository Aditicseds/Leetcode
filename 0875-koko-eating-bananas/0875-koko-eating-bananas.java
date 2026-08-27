class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int ans=0;
        Arrays.sort(piles);
        int n=piles.length;
        ans=0;
        int f=1,l=piles[n-1];
        while(f<=l){
            int mid=(f+l)/2;
            long hours=0;
            for(int pile:piles){
                int t=pile/mid;
                if(pile%mid!=0){
                    hours=hours+t+1;
                }
                else{
                    hours+=t;
                }
                
            }
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