package inter;

public class Problem63 {

	public static void main(String[] args) {
		
		int a=20;
		int b=200;
		for(int i=1;i*i<=b;i++)
		{
			int square=i*i;
			if(square>=a&&square<=b)
			{
				System.out.print(square+" ");
			}
		}
	}

}
