/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> ans = new ArrayList<>();
    Map<TreeNode,Integer> map = new HashMap<>();
    int mapping(TreeNode root,TreeNode target,int k){
        if(root==null)return -1;
        if(root==target){
            map.put(root,0);
            return 0;
        }
        int l=mapping(root.left,target,k);
        if(l>=0){
            map.put(root,l+1);
            return l+1;
        }
        int r=mapping(root.right,target,k);
        if(r>=0){
            map.put(root,r+1);
            return r+1;
        }
        return -1;
    }
    void dfs(TreeNode root, TreeNode target, int k, int length){
        if(root==null)return;
        if(map.containsKey(root)) length=map.get(root);
        if(length==k)ans.add(root.val);
        dfs(root.left,target,k,length+1);
        dfs(root.right,target,k,length+1);
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        mapping(root,target,k);
        dfs(root,target,k,0);
        return ans; 
    }
}