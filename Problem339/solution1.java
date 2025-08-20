package inter;

public class Problem77 {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},
					{4,5,6},
					{7,8,9}
		};
	
		int rotated[][]=a;
		int degree=270;
		int times=degree/90;
		for(int i=0;i<times;i++)
		{
			rotated=rotate90(rotated);	
		}
		
		for(int i=0;i<rotated.length;i++)
		{
			for(int j=0;j<rotated.length;j++)
			{
				System.out.print(rotated[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] rotate90(int a[][])
	{
		int n=a.length;
		int ans[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
			{
				ans[j][n-1-i]=a[i][j];
			}
		}
		return ans;
	}
}
