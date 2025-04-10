/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        HashMap<TreeNode,TreeNode> map=new HashMap<>();
        Queue<TreeNode> qu=new LinkedList<>();
        qu.add(root);
        map.put(root,null);

        while(!qu.isEmpty())
        {
            int size=qu.size();
            for(int i=0;i<size;i++)
            {
                root=qu.poll();
                if(root.left!=null)
                {
                    qu.add(root.left);
                    map.put(root.left,root);
                }
                if(root.right!=null)
                {
                    qu.add(root.right);
                    map.put(root.right,root);
                }
            }
        }
       
        HashSet<TreeNode> set=new HashSet<>();

        while(p!=null)
        {
            set.add(p);
            p=map.getOrDefault(p,null);
            
        }
        while(!set.contains(q))
        {
            q=map.getOrDefault(q,null);
        }

        return q;
    }
}
