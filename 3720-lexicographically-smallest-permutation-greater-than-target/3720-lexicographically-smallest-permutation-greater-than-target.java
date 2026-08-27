class Solution {
    String ans ;
    boolean permute(int idx, int[]cnt, String target, StringBuilder temp, boolean g){
        if(idx==target.length()){
            if(g==true){
               ans=temp.toString();
               return true;
            }
            return false;
        }
        for(char i='a';i<='z';i++){
            if(cnt[i-'a']==0) continue;
            if(g==false && i<target.charAt(idx)) continue;
            temp.append(i);
            cnt[i-'a']--;
            boolean isG = g || i>target.charAt(idx);
            if(permute(idx+1,cnt,target,temp,isG)){
                return true;
            }
            temp.deleteCharAt(temp.length()-1);
            cnt[i-'a']++;

        }
        return false;
    }
    public String lexGreaterPermutation(String s, String target) {
        int cnt[]=new int[26];
        for(char c : s.toCharArray()){
            cnt[c-'a']++;
        }
        StringBuilder sb =new StringBuilder();
       boolean flag = permute(0,cnt,target,sb,false);
       if(flag==true) return ans;
       return "";

    }
}