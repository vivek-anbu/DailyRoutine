package inter;

public class Problem72 {

	public static void main(String[] args) {
		
		int n=101;
		System.out.println("Count of Character :"+countChar(n));

	}
	public static int countChar(int n)
	{
	
		int start=1;
		int count=0;
		int digits=1;
		while(start*10<=n)
		{
			count+=(9*start)*digits;
			start*=10;
			digits++;
		}
		count+=(n-start+1)*digits;
		return count;
	}

}
