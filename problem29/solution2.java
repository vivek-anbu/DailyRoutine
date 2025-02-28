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
    public TreeNode bstFromPreorder(int[] preorder) {
        
        TreeNode root=null;
        for(int i:preorder)
        {
            if(root==null)
            {
                root=add(null,i);
            }
            else
                add(root,i);
        }
        return root;
    }   
    public TreeNode add(TreeNode root,int n)
    {
        if(root==null)
        {
            root=new TreeNode(n);
        }
        if(root.val<n)
        {
            root.right=add(root.right,n);
        }
        else if(root.val>n)
        {
            root.left=add(root.left,n);
        }
        return root;
}
}
