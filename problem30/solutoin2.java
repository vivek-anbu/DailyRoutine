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
    public boolean findTarget(TreeNode root, int k) {
        
        List<Integer> list=new ArrayList<>();
        inOrder(root,list);
        for(int i=0;i<list.size();i++)
        {
            int ans=k-list.get(i);
            for(int j=i+1;j<list.size();j++)
            {
                if(ans==list.get(j))
                {
                    return true;
                }
            }
        }

        return false;
    }
    public void inOrder(TreeNode root,List<Integer>list)
    {
        if(root==null)
        {
            return ;
        }
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);


    }
}
