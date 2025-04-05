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
    int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
         diameter=0;
         dfs(root);
        return diameter;
    }
    public int dfs(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        
        int leftPath=dfs(root.left);
        int rightPath=dfs(root.right);
        diameter=Math.max(diameter,leftPath+rightPath);
        return Math.max(leftPath,rightPath)+1;
    }
}
