package inter;

import java.util.Scanner;

public class Problem60 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=in.nextInt();
		int odd=1;
		int even=2;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print(even+" " );
					even=even+2;
				}
				else
				{
					System.out.print(odd+" ");
					odd=odd+2;
				}
			}
			System.out.println();
		}
	}

}
