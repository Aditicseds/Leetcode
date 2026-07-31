class Solution {
    public int minimumPushes(String word) {
        int[]  freq = new int[26];
        int ans = 0;
        for(int i=0;i<word.length();i++){
            char c =word.charAt(i);
            freq[c-'a']++;
        }
        Arrays.sort(freq);
        for(int i=25;i>=0;i--){
            ans+=freq[i]*((25-i)/8+1);
        }
        return ans;
    }
}