class Solution {
    public void setZeroes(int[][] matrix) {
        
        int rowlength=matrix.length;
        int collength=matrix[0].length;
        int a[]=new int[rowlength];
        int b[]=new int[collength];
        for(int i=0;i<rowlength;i++)
        {
            for(int j=0;j<collength;j++)
            {
                if(matrix[i][j]==0)
                {
                    a[i]=1;
                    b[j]=1;
                }
            }
        }
        for(int i=0;i<rowlength;i++)
        {
            for(int j=0;j<collength;j++)
            {
                if(a[i]==1||b[j]==1)
                {
                    matrix[i][j]=0;
                }

            }
        }

    }
}
