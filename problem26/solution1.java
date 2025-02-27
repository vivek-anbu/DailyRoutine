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
    public int kthSmallest(TreeNode root, int k) {
        
        if(root==null)
        {
            return -1;
        }
        int index=0;
        Stack<TreeNode> st=new Stack<>();
        while(root!=null||!st.isEmpty())
        {
            while(root!=null)
            {
                st.push(root);
                root=root.left;
            }   
            root=st.pop();
            index++;
            if(k==index)
            {
                return root.val;
            }
            else
            {
                root=root.right;
            }

        }
        return -1;

    }
}
