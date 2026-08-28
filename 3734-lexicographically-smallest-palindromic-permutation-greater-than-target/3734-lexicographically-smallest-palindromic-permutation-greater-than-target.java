class Solution {
    String ans = "";
    char mid ='$';
    int half=0;
    boolean permute(int idx, int[]cnt, String target, StringBuilder temp, boolean g){
        if(idx==half){
            String left=temp.toString();
            String right= new StringBuilder(temp).reverse().toString();
            if(mid!='$'){
                left+=mid;
            }
            left+=right;
            if(left.compareTo(target)>0){
                ans=left;
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
    public String lexPalindromicPermutation(String s, String target) {
        int cnt[]=new int[26];
        for(char c : s.toCharArray()){
            cnt[c-'a']++;
        }
        int odd=0;
        for(int i=0;i<=25;i++){
            if(cnt[i]%2==1){
              odd++;
              mid=(char)(i+'a');
            }
        }
        if(odd>1){
            return "";
        }
        for(int i = 0;i<26;i++){
            cnt[i]=cnt[i]/2;
        }
        half = target.length()/2;
        StringBuilder temp = new StringBuilder() ;
        permute(0,cnt,target,temp,false);
        return ans;

    }
}