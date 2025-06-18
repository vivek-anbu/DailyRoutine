// User function Template for Java

class Solution {
    public int[] antiDiagonalPattern(int[][] matrix) {
        
       int row=matrix.length;
       int col=matrix[0].length;
       int ans[]=new int[row*col];
       int pos=0;
       int count=0;
       for(int i=0;i<row;i++)
       {
           pos=0;
           for(int j=i;j>=0;j--)
           {
               ans[count++]=matrix[pos][j];
               pos++;
           }
       }
       for(int i=1;i<row;i++)
       {
           pos=i;
           for(int j=col-1;j>=i;j--)
           {
               ans[count++]=matrix[pos][j];
               pos++;
           }
       }
       return ans;
        
        
    }
}
