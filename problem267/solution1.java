package inter;

public class Problem10 {

	public static void main(String[] args) {
		
		 int[][] board = {
		            {5,3,4,6,7,8,9,1,2},
		            {6,7,2,1,9,5,3,4,8},
		            {1,9,8,3,4,2,5,6,7},
		            {8,5,9,7,6,1,4,2,3},
		            {4,2,6,8,5,3,7,9,1},
		            {7,1,3,9,2,4,8,5,6},
		            {9,6,1,5,3,7,2,8,4},
		            {2,8,7,4,1,9,6,3,5},
		            {3,4,5,2,8,6,1,7,9}
		        };
		 if(isValid(board))
		 {
			 System.out.println("Valid Sudoko");
		 }
		 else 
		 {
			 System.out.println("Not Valid");
		 }

	}
	public static boolean isValid(int board[][])
	{
		
		return validRow(board)&&validCol(board)&&validSubmatrices(board);
	}
	public static boolean validRow(int board[][])
	{
		
		for(int i=0;i<9;i++)
		{
			boolean seen[]=new boolean[10];
			for(int j=0;j<9;j++)
			{
				int num=board[i][j];
				if(num<1||num>9||seen[num])
				{
					return false;
				}
				seen[num]=true;
			}
		}
		return true;
	}
	public static boolean validCol(int board[][])
	{
		
		for(int j=0;j<9;j++)
		{
			boolean seen[]=new boolean[10];
			for(int i=0;i<9;i++)
			{
				int num=board[i][j];
				if(num<1||num>9||seen[num])
				{
					return false;
				}
				seen[num]=true;
			}
		}
		return true;
	}
	public static boolean validSubmatrices(int board[][])
	{
		for(int i=0;i<9;i=i+3)
		{
			for(int j=0;j<9;j=j+3)
			{
				if(!singleSub(board,i,j))
				{
					return false;
				}
				
			}
		}
		return true;
		
	}
	public static boolean singleSub(int board[][],int startRow,int StartCol)
	{
		
		for(int i=startRow;i<startRow+3;i++)
		{
			boolean seen[]=new boolean[10];
			for(int j=StartCol;j<StartCol+3;j++)
			{
				int num=board[i][j];
				if(num<1||num>9||seen[num])
				{
					return false;
				}
			}
		}
		return true;
	}

}
