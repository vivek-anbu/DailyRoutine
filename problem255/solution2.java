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
    int diameter=0;
    int count=0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root==null)
        {
            return 0;
        }
        count++;
        int left=diameterOfBinaryTree(root.left);
        int right=diameterOfBinaryTree(root.right);
        diameter=Math.max(diameter,left+right);
        count--;
        return count==0?diameter:Math.max(left,right)+1;
    }
}
