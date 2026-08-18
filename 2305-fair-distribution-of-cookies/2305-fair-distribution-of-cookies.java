class Solution {
    int ans=Integer.MAX_VALUE;
    int p=0;
    void backtrack(int c, int[]cookies,int[] temp){
        
        if (c == cookies.length) {
            int unfairness = Integer.MIN_VALUE;
            for (int value : temp) {
                unfairness= Math.max(unfairness, value);
            }
            ans=Math.min(ans,unfairness);
            return;
        }
         for (int j = 0; j < temp.length; ++j) {
            temp[j] += cookies[c];          
            backtrack(c+1,cookies,temp);
            temp[j] -= cookies[c];  
        }

    }
    public int distributeCookies(int[] cookies, int k) {
        int []temp=new int[k];
        backtrack(0,cookies,temp);
        return ans;
    }
}