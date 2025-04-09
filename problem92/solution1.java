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
            return new ArrayList<>();
        } 
        int minPos=0;
        int maxPos=0;
        Queue<Pair<Integer,TreeNode>> q=new LinkedList<>();
        q.add(new Pair<>(0,root));
        Map<Integer,List<Integer>> map=new HashMap<>();
        while(!q.isEmpty())
        {
            Pair<Integer,TreeNode> curNodePos=q.poll();
            TreeNode curNode=curNodePos.getValue();
            int curPos=curNodePos.getKey();
            if(!map.containsKey(curPos))
                map.put(curPos,new ArrayList<>());
                map.get(curPos).add(curNode.val);
            if(curNode.left!=null)
            {
                q.add(new Pair<>(curPos-1,curNode.left));
                minPos=Math.min(curPos-1,minPos);
            }
            if(curNode.right!=null)
            {
                q.add(new Pair<>(curPos+1,curNode.right));
                maxPos=Math.max(curPos+1,maxPos);
            }
        }
        for(int i=minPos;i<=maxPos;i++)
        {
            res.add(map.get(i));
        }

    return res;
    }
}
