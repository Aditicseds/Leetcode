class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int i=0,j=0,ans=0;
        int[]freq=new int[3];
        while(j<n){

         freq[s.charAt(j) - 'a']++;
         
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                ans += n - j;
                
                if (s.charAt(i) == 'a') freq[0]--;
                else if (s.charAt(i) == 'b') freq[1]--;
                else if (s.charAt(i) == 'c') freq[2]--;
                
                i++;
            }
        
         j++;
        }
        return ans;
    }
}