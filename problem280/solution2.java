package inter;

public class Problem23 {

	public static void main(String[] args) {
		
		System.out.println("Odd Numbers Betwwen 2 to 15");
		Problem23.oddNumbers();
		
	}
	public static void oddNumbers()
	{
		int start=2;
		int end=15;
		for(int i=start+1;i<end;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+",");
			}
		}
	}

}
