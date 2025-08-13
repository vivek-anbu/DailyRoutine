package inter;

public class Problem68 {

	public static void main(String[] args) {
		 int[][] big = {
		            {1, 2, 3, 4, 5},
		            {6, 7, 8, 9, 0},
		            {1, 3, 5, 7, 9},
		            {4, 6, 8, 0, 2},
		            {5, 7, 9, 1, 3}
		        };

		        int[][] small = {
		            {8, 9},
		            {5, 7}
		        };
		        
		       boolean res=canSubmatrices(big,small);
		       System.out.println(res?"TRUE":"FALSE");

	}
	public static boolean canSubmatrices(int big[][],int small[][])
	{
		int n=big.length;
		int m=small.length;
		for(int i=0;i<=n-m;i++)
		{
			for(int j=0;j<=n-m;j++)
			{
				if(isMatch(big,small,i,j))
				{
					return true;
				}
			}
		}
		return false;
	}
	public static boolean isMatch(int big[][],int small[][],int row,int col)
	{
		int m=small.length;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(big[row+i][col+j]!=small[i][j])
				{
					return false;
				}
			}
		}
		return true;
		
	}
}
