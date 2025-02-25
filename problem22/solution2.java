public class Solution {

    public  static int findCeil(TreeNode<Integer> node, int x) {

        int ceil=-1;
        if(node==null)
        {
            return -1;
        }
        if(node.data==x)
        {
            ceil=node.data;
            return ceil;
        }
        if(node.data<x)
        {
            return findCeil(node.right,x);
        }
        else
        {   

            ceil =findCeil(node.left,x);
        }
        if(ceil>=x)
        {
            return ceil;
        }

        return node.data;
    }
}
