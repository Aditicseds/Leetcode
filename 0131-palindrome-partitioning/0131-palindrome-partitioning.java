class Solution {
    List<List<String>> ans=new ArrayList<>();
    void backtrack(String st,List<String> curr,int idx){
        if(idx==st.length()){
            ans.add(new ArrayList<>(curr));
        }
        for(int i=idx;i<st.length();i++){
            if(isPal(st,idx,i)){
                curr.add(st.substring(idx,i+1));
                backtrack(st,curr,i+1);
                curr.remove(curr.size()-1);
            }
        }
    }
    boolean isPal(String s,int i,int j){
          while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
          }
          return true;
    }
    public List<List<String>> partition(String s) {
        List<String> temp = new ArrayList<>();
        backtrack(s,temp,0);
        return ans;
        
    }
}