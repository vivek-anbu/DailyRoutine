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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> res=new ArrayList<>();
        if(root==null)
        {
            return res;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            while(size-->0)
            {
                root=q.poll();
                if(root.left!=null)
                {
                    q.add(root.left);
                }
                if(root.right!=null)
                {
                    q.add(root.right);
                }
            }
            res.add(root.val);
        }
        return res;
    }   
}
