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
    Map<Integer,Integer> map=new HashMap<>();
    int idx=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
      }
      return build(preorder,inorder,0,inorder.length-1);
    }
    public TreeNode build(int [] preorder,int[] inorder,int s,int e)
    {
        if(s>e)
        {
            return null;
        }
        int cur=preorder[idx++]; 
        TreeNode node=new TreeNode(cur);
        int id=map.get(cur);
        node.left=build(preorder,inorder,s,id-1);
        node.right=build(preorder,inorder,id+1,e);
        return node;

    }
}
