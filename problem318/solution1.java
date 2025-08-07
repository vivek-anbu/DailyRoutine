package inter;

public class Problem57 {

	public static void main(String[] args) {
		
		int mat[][]= {{1,2,3},
						{4,5,6},
						{7,8,9}
		};
		
		rotateArray(mat);

	}
	public static void rotateArray(int mat[][])
	{
		int n=mat.length;
		int top=0;
		int left=0;
		int bottom=n-1;
		int right=n-1;
		
		while(left<right&&top<bottom)
		{
			int prev=mat[top+1][left];
			
			for(int i=left;i<=right;i++)
			{
				int cur=mat[top][i];
				mat[top][i]=prev;
				prev=cur;
			}
			top++;
			for(int i=top;i<=bottom;i++)
			{
				int cur=mat[i][right];
				mat[i][right]=prev;
				prev=cur;
			}
			right--;
			for(int i=right;i>=left;i--)
			{
				int cur=mat[bottom][i];
				mat[bottom][i]=prev;
				prev=cur;
			}
			bottom--;
			for(int i=bottom;i>=top;i--)
			{
				int cur=mat[i][left];
				mat[i][left]=prev;
				prev=cur;
			}
			left++;
		}
		
		for(int row[]:mat)
		{
			for(int a:row)
			{
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}

}
