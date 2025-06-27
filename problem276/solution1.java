package inter;

public class Problem19 {

	public static void main(String[] args) {
		
		String s="12345";
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			int j=n-1-i;
			for(int k=0;k<n;k++)
			{
				if(k==i||k==j)
				{
					System.out.print(s.charAt(k));
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
