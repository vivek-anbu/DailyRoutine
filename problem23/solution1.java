
// User function Template for Java

class Solution {
    public static int floor(Node root, int x) {
        
        int floor=-1;
        
        if(root==null)
        {
            return -1;
        }
        while(root!=null)
        {
            if(root.data==x)
            {
                floor=root.data;
                return floor;
            }
            if(root.data<=x)
            {
                floor=root.data;
                root=root.right;
            }
            else
            {
                root=root.left;
            }
            
        }
    return floor;
    }
}
