// User function Template for Java

class Solution {
    public int[] antiDiagonalPattern(int[][] matrix) {
        
        int row=matrix.length;
        int col=matrix[0].length;
        int cur=0;
        int ans[]=new int[row*col];
        for(int i=0;i<row;i++)
        {
            int pos=0;
            for(int j=i;j>=0;j--)
            {
                ans[cur++]=matrix[pos][j];
                pos++;
            }
        }
        for(int i=1;i<row;i++)
        {
            int pos=i;
            for(int j=col-1;j>=i;j--)
            {
                ans[cur++]=matrix[pos][j];
                pos++;
            }
        }
        
        return ans;
    }
}
