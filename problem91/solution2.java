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
    int max=0;
    int count=0;
    public int maxPathSum(TreeNode root) {
        
        if(root==null)
        {
            return 0;
        }
        count++;
        if(count==1)
        {
            max=root.val;
        }
        int left=maxPathSum(root.left);
        int right=maxPathSum(root.right);
        count--;
        if(left<0&&right<0)
        {
            max=Math.max(max,root.val);
        }
        else if(right<0)
        {
            max=Math.max(root.val,root.val+right);
        }
        else if(left<0)
        {
            max=Math.max(root.val,root.val+left);
        }
        else
        {
            max=Math.max(max,root.val+left+right);
        }
        if(count==0)
        {
            return max;
        }
        return Math.max(0,Math.max(left,right)+root.val);
    }
}
