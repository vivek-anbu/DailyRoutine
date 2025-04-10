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

    public int widthOfBinaryTree(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        int id=1;
        int level=0;
       int  maxWidth=dfs(root,level,id,list);
         return maxWidth;
    }
    public int dfs(TreeNode root,int level,int id,List<Integer> list)
    {
        if(root==null)
        {
            return 0;
        }
        if(level==list.size())
        {
            list.add(id);
        }
        int curWidth=id-list.get(level)+1;
        int left=dfs(root.left,level+1,id*2,list);
        int right=dfs(root.right,level+1,id*2+1,list);

        return Math.max(curWidth,Math.max(left,right));
    }

}
