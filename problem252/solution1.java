/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Solution {
    List<List<Integer>> treeTraversal(TreeNode root) {
       
       List<Integer> pre=new ArrayList<>();
       List<Integer> po=new ArrayList<>();
       List<Integer> in=new ArrayList<>();
       Stack<Pair<TreeNode,Integer>> st=new Stack<>();
       st.push(new pair<>(root,1));
        while(!st.isEmpty())
        {
            Pair<TreeNode,Intger> it =st.pop();
            if(it.getValue()==1)
            {
                pre.add(it.getKey().data);

                it.setValue(2);
                st.push(it);
                if(it.getKey().left!=null)
                {
                    st.push(new Pair<>(it.getKey(),1));
                }
            }
            else if(it.getValue==2)
            {
                in.add(it.getKey().data);
                it.setValue(3);
                st.push(it);
                if(it.getKey().right!=null)
                {
                    st.push(new Pair<>(it.getKey().right));
                }
            }
            else
            {
                po.add(it.getkey().data);
            }
        }
        List<List<Integer>> res=new ArrayList<>();
        res.add(pre);
        res.add(in);
        res.add(po);

        return res;
    }
}
