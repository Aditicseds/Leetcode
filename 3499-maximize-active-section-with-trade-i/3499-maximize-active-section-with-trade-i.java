class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ones=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')ones++;
        }
        if(ones==0)return 0;
        List<Integer> cnt = new ArrayList<>();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='0'){
               int idx=i;
               while(i<s.length() && s.charAt(i)=='0'){
                    i++;
                    
                }
                cnt.add(i-idx);

            }
            else{
                i++;
            }
         
        }
        int ans=0;
        for(int j=1;j<cnt.size();j++){
            ans=Math.max(ans,cnt.get(j)+cnt.get(j-1));
        }
        return ans+ones;
    }
}