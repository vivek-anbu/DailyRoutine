package inter;

public class Problem23 {

	public static void main(String[] args) {
		
		System.out.println("Odd Numbers Betwwen 2 to 15");
		Problem23.oddNumbers();
		
	}
	public static void oddNumbers()
	{
		for(int i=2;i<15;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
		}
	}

}
