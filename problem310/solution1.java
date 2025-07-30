package inter;

import java.util.Scanner;

public class Problem48 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter N: ");
		int n=in.nextInt();
		System.out.println("Enter M: ");
		int m=in.nextInt();
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0||i==m-1||j==n-1)
				{
					System.out.print("X ");
				}
				else
				{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	
	}
}
