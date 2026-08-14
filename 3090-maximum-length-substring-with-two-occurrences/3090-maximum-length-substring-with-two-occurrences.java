class Solution {
    public int maximumLengthSubstring(String s) {
       int [] f =new int[26];
       int ans=0;
       int i=0,j=0;
       int l = s.length();
       while(j<l){
        f[s.charAt(j)-'a']++;
        while(i<l && f[s.charAt(j)-'a']>2){
            f[s.charAt(i)-'a']--;
            i++;
        }
        ans=Math.max(ans,j-i+1);
        j++;
       }
       return ans;
    }
}