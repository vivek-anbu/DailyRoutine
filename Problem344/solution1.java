package inter;

public class Sudoku {

	public static void main(String[] args) {
		
		int board[][]= {{5,3,4,6,7,8,9,1,2},
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
			System.out.println("Valid Sudoku");
		}
		else
		{
			System.out.println("Not Valid");
		}
	}
	public static boolean isValid(int board[][])
	{
		return rowValid(board)&&colValid(board)&&subValid(board);
	}
	public static boolean rowValid(int board[][])
	{
		
		for(int i=0;i<9;i++)
		{
			boolean seen[]=new boolean[10];
			for(int j=0;j<9;j++)
			{
				int num=board[i][j];
				if(num<0||num>9||seen[num])
				{
					return false;
				}
				seen[num]=true;
			}
		}
		return true;
	}
	public static boolean colValid(int board[][])
	{
		
		for(int i=0;i<9;i++)
		{
			boolean seen[]=new boolean[10];
			for(int j=0;j<9;j++)
			{
				int num=board[j][i];
				if(num<0||num>9||seen[num])
				{
					return false;
				}
				seen[num]=true;
			}
		}
		return true;
	}
	public static boolean subValid(int board[][])
	{
		for(int i=0;i<9;i=i+3)
		{
			for(int j=0;j<9;j=j+3)
			{
				if(!validSub(board,i,j))
				{
					return false;
				}
			}
		}
		return true;
	}
	public static boolean validSub(int board[][],int startRow,int startCol)
	{
		boolean seen[]=new boolean[10];
		for(int i=startRow;i<startRow+3;i++)
		{
				for(int j=startCol;j<startCol+3;j++)
			{
				int num=board[i][j];
				if(num<0||num>9||seen[num])
				{
					return false;
				}
				seen[num]=true;
			}
		}
		return true;
	}
}
