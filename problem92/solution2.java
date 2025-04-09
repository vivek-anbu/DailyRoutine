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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
        {
            return res;
        }
        Queue<Pair<Integer,TreeNode>> q=new LinkedList<>();
        q.add(new Pair<>(0,root));
        Map<Integer,List<Integer>> map=new TreeMap<>();
        while(!q.isEmpty())
        {
            Pair<Integer,TreeNode> curNodePos=q.poll();
            TreeNode curNode=curNodePos.getValue();
            int curPos=curNodePos.getKey();
            if(!map.containsKey(curPos))
            {
                map.put(curPos,new ArrayList<>());
            }
            map.get(curPos).add(curNode.val);
            if(curNode.left!=null)
            {
                q.add(new Pair<>(curPos-1,curNode.left));
              
            }
            if(curNode.right!=null)
            {
                q.add(new Pair<>(curPos+1,curNode.right));
                
            }

        }
        
        return new ArrayList<>(map.values());
    }
}
