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
    List<List<Integer>> l=new ArrayList<>();
     void put(TreeNode root, int target, List<Integer> current){
        if(root==null)return ;
        current.add(root.val);
        if (root.left == null && root.right == null && target==root.val) {
            l.add(new ArrayList<>(current));
        }
        put(root.left, target-root.val, current);
        put(root.right, target-root.val, current);
        current.remove(current.size() - 1);

    }
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        put(root,target, new ArrayList<>());
        return l;
    }
}