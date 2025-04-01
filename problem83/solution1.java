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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
        {
            return res;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(q.size()>0)
        {
            ArrayList<Integer> curLevelElements=new ArrayList<>();
            int size=q.size();
            while(size-->0)
            {
                TreeNode curElements=q.poll();
                curLevelElements.add(curElements.val);
                if(curElements.left!=null)
                {
                    q.add(curElements.left);
                }
                if(curElements.right!=null)
                {
                    q.add(curElements.right);
                }
            }
            res.add(curLevelElements);
        }
        return res;
    }
}
