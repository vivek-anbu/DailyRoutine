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
        
        TreeNode root=new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++)
        {
            solve(root,preorder[i]);
        }
        return root;
    }
    public void solve(TreeNode root,int num)
    {
        if(num>root.val)
        {
         if(root.right==null)
        {
            root.right=new TreeNode(num);
        }
        else
        {
            solve(root.right,num);
        }
        }
        if(num<root.val)
        {
            if(root.left==null)
            {
                root.left=new TreeNode(num);
            }
            else
            {
                solve(root.left,num);
            }
        }

    }
}
