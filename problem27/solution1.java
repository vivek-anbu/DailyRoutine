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
    public boolean isValidBST(TreeNode root) {
        
        if(root==null)
        {
            return true;
        }
        TreeNode previousNode=null;
        Stack<TreeNode> st=new Stack<>();
        while(root!=null||!st.isEmpty())
        {
            while(root!=null)
            {
                st.push(root);
                root=root.left;
            }
            root=st.pop();
            if(previousNode!=null&&root.val<=previousNode.val)
            {
                return false;
            }
            previousNode=root;
            root=root.right;
        }

        return true;
    }
}
