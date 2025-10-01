package inter;

public class SquareBetAandB {

	public static void main(String[] args) {
		
		int a=20;
		int b=100;
		System.out.println("Square Betwwen "+a+" And"+b);
		for(int i=1;i*i<=b;i++)
		{
			int sq=i*i;
			if(sq>=a&&sq<=b)
			{
				System.out.println(sq);
			}
		}

	}

}
