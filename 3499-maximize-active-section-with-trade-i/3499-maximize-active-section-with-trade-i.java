class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ones=0;
        int i=0,j=0;
        int ans=0;
        for(char c: s.toCharArray()){
            if(c=='1'){
               ones++;
            }
        }
        int prev=0,next=0;
        while(j<s.length()){
            if(s.charAt(j)=='1'){
                int start=j;
                while(start<s.length() && s.charAt(start)=='1'){
                    start++;
                }
                if(start==s.length()) break;
                next=0;
                while(start<s.length() && s.charAt(start)=='0'){
                    next++;
                    start++;
                }
                if(prev>0 && next>0){
                    i=Math.max(i,prev+next);
                }
                prev=next;
                j=start;

            }
            else{
                prev++;
                j++;
            }
        }
        return i+ones;
    }
}