class Solution {
    StringBuilder ans = new StringBuilder();
    public String processStr(String s) {
      for(int i=0;i<s.length();i++){
        if(ans.length()>=1 && s.charAt(i)=='*'){
            ans.deleteCharAt(ans.length()-1);
        }
        else if(ans.length()>=1 && s.charAt(i)=='#'){
            StringBuilder sb = new StringBuilder(ans);
            ans.append(sb);
        }
        else if(ans.length()>=1 && s.charAt(i)=='%'){
            ans.reverse();
        }
        else if(Character.isLetter(s.charAt(i))){
            ans.append(s.charAt(i));
        }
      }
      return ans.toString();

    }
}