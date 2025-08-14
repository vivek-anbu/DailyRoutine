package inter;

public class Problem71 {

	public static void main(String[] args) {
		
		int  n=4;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				int top=i;
				int bottom=j;
				int left=n-1-i;
				int right=n-1-j;
				System.out.print(n-Math.min(Math.min(top, bottom),Math.min(left,right)));
			}
			System.out.println();
				
		}
			
		

	}

}
