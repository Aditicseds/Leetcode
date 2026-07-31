class Solution {
    public int minimumPushes(String word) {
        int[]  freq = new int[26];
        int ans = 0;
        for(int i=0;i<word.length();i++){
            char c =word.charAt(i);
            freq[c-'a']++;
        }
        Arrays.sort(freq);
        for(int i=25;i>17;i--){
            ans=ans+freq[i];
        }
        for(int i=17;i>9;i--){
            ans=ans+(2*freq[i]);
        }
        for(int i=9;i>1;i--){
            ans=ans+(3*freq[i]);
        }
        ans=ans+(4*freq[1]);
        ans=ans+(4*freq[0]);
        return ans;


    }
}