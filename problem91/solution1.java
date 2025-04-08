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
    int maxSum;
    public int maxPathSum(TreeNode root) {
       if(root==null)
       {
        return 0;
       } 
       maxSum=Integer.MIN_VALUE;
       sumMax(root);
       return maxSum;
    }
    public int sumMax(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftPath=sumMax(root.left);
        int rightPath=sumMax(root.right);
        int allNode=root.val+leftPath+rightPath;
        int maxLeft=Math.max(root.val,root.val+leftPath);
        int maxRight=Math.max(root.val,root.val+rightPath);
        int maxOfOneSide=Math.max(maxLeft,maxRight);
        int maxOfAll=Math.max(maxOfOneSide,allNode);
        maxSum=Math.max(maxSum,maxOfAll);
        return maxOfOneSide;


    }
}
