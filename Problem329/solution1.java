package inter;

public class Problem69 {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},
				{4,5,6},
				{7,8,9}};

		int b[][]= {{7,4,1},
					{8,5,2},
					{9,6,3}};
		
		if(canRotate(a,b))
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
		
	}
	public static boolean canRotate(int a[][],int b[][])
	{
		int n=a.length;
		int rotated[][]=copyMat(a);
		for(int i=0;i<n;i++)
		{
			rotated=rotate90(rotated);
			if(areSame(b,rotated))
			{
				return true;
			}
		}
		return false;
		
	}
	public static boolean areSame(int m1[][],int m2[][])
	{
			int n=m1.length;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(m1[i][j]!=m2[i][j])
					{
						return false;
					}
				}
			}
			return true;
	}
	public static int [][] rotate90(int a[][])
	{
		int n=a.length;
		int rotated[][]=new int [n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				rotated[j][n-1-i]=a[i][j];
			}
			
		}
		return rotated;
		
	}
	public static int[][] copyMat(int a[][])
	{
		int n=a.length;
		
		int copy[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.arraycopy(a[j], 0, copy[j], 0, n);
			}
		}
			return copy;
	}
}
