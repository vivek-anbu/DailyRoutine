package inter;

public class PrintPattern {

	public static void main(String[] args) {
		
		int n=6;
		int start[]=new int[n];
		
		int next=1;
		for(int i=0;i<n;i++)
		{
			start[i]=next;
			next+=(n-i);
		}
		
		for(int r=0;r<n;r++)
		{
			for(int c=0;c<n-r;c++)
			{
				System.out.print(start[c]+r+"\t");
			}
			System.out.println();
		}
	}

}
