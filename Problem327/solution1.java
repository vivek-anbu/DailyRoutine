package inter;

public class Problem67 {

	public static void main(String[] args) {
		
		int n=6;
		int next=1;
		
		int start[]=new int[n];
		for(int c=0;c<n;c++)
		{
			start[c]=next;
			next+=(n-c);
		}
		
		for(int r=0;r<n;r++)
		{
			for(int c=0;c<n-r;c++)
			{
				System.out.print((start[c]+r)+"\t");
			}
			System.out.println();
		}
	}

}
