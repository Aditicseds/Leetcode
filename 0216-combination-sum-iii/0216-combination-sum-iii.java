class Solution {
    List<List<Integer>> ans= new ArrayList<>();
    void backtrack(List<Integer> curr,int idx,int n,int k,int sum){
        int s=curr.size();
        if(sum==n && s==k){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(sum>n){
            return ;
        }
        for(int i=idx;i<=9;i++){
            curr.add(i);
            backtrack(curr,i+1,n,k,sum+i);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> curr=new ArrayList<>();
        backtrack(curr,1,n,k,0);
        return ans;
    }
}