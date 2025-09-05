package inter;

public class Xpattern {

	public static void main(String[] args) {
		
		int n=4,m=5;
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0||i==m-1||j==n-1)
				{
					System.out.print("X ");
				}
				else if(i==1||j==1||i==m-2||j==n-2)
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print("X ");
				}
			}
			System.out.println();
		}

	}

}
