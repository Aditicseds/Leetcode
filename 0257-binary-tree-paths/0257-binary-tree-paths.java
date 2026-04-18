/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<String> ans=new ArrayList<>();
    void add(TreeNode root,String st){
        if(root==null)return;
        st+=Integer.toString(root.val);
        if(root.left==null && root.right==null){
            ans.add(st);
            return;
        }
        if(root.left!=null){
        add(root.left,st+"->");
        }
        if(root.right!=null){
        add(root.right,st+"->");
        }

    }
    public List<String> binaryTreePaths(TreeNode root) {
    add(root,"");
    return ans;
    }
}