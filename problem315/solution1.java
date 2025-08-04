package inter;

public class Problem53 {

	public static void main(String[] args) {
		
		int n=1000;
		StringBuilder sb=new StringBuilder();
		System.out.println("Input :"+n);
		
		while(n>0)
		{
			n--;
			int rem=n%26;
			char letter=(char)('A'+rem);
			sb.append(letter);
			n=n/26;
		}
		sb.reverse();
		System.out.println("OutPut :"+sb.toString());
		
	}

}
