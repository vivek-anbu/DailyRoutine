package inter;
public class CountRectangles {

    public static int countRectangles(int matrix[][])
    {
    	int count =0;
    	int row=matrix.length;
    	int col=matrix[0].length;
    	boolean visited[][]=new boolean[row][col];
    	for(int i=0;i<row;i++)
    	{
    		for(int j=0;j<col;j++)
    		{
    			if(matrix[i][j]==1&&!visited[i][j]&&(i==0||matrix[i-1][j]==0)&&
    					(j==0||matrix[i][j-1]==0))
    			{
    				markRectangle(matrix,visited,i,j);
    				count++;
    			}
    		}
    	}
    	return count;
    }
    public static void markRectangle(int matrix[][],boolean visited[][],int startRow,int startCol)
    {
    	int row=startRow;
    	int col=startCol;
    	
    	while(row<matrix.length&&matrix[row][col]==1)
    	{
    		row++;
    	}
    	while(col<matrix[0].length&&matrix[row][col]==1)
    	{
    		col++;
    	}
    	for(int i=startRow;i<row;i++)
    	{
    		for(int j=startCol;j<col;j++)
    		{
    			visited[i][j]=true;
    		}
    	}
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 1, 0},
            {1, 1, 1, 0},
            {0, 0, 1, 1},
            {0, 0, 1, 1}
        };

        System.out.println("Number of rectangles: " + countRectangles(matrix)); 
    }
}
