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
        int idx = 0;
        TreeNode build(int[] preorder, long min, long max) {
        if (idx >= preorder.length) return null;

        int val = preorder[idx];
        if (val <= min || val >= max) return null;

        TreeNode root = new TreeNode(val);
        idx++;

        if (idx < preorder.length &&
            preorder[idx] > min &&
            preorder[idx] < root.val) {
            root.left = build(preorder, min, root.val);
        }
        if (idx < preorder.length &&
            preorder[idx] > root.val &&
            preorder[idx] < max) {

            root.right = build(preorder, root.val, max);
        }

        return root;
        }    
    public TreeNode bstFromPreorder(int[] preorder) {
        return build(preorder, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}