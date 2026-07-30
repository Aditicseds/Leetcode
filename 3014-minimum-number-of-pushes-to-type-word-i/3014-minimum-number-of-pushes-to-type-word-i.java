class Solution {
    public int minimumPushes(String word) {
        int ans = 0;
        if(word.length()<=8) return word.length();
        if(word.length()>24){
            ans+=8;
            ans+=16;
            ans+=24;
            ans=ans+4*(word.length()-24);
        }
        else if(word.length()>16){
            ans+=8;
            ans+=16;
            ans=ans+3*(word.length()-16);
        }
        else if(word.length()>8){
            ans+=8;
            ans=ans+2*(word.length()-8);
        }
        return ans;
    }
}