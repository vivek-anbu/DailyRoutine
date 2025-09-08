package inter;

public class NumberToChar {

	public static void main(String[] args) {
		
		int num=1000;
		StringBuilder sb=new StringBuilder();
		System.out.println("Input:"+num);
		while(num>0)
		{
			num--;
			int rem=num%26;
			char letter =(char)('A'+rem);
			sb.append(letter);
			num=num/26;
		}
		sb.reverse();
		System.out.println("OutPut:"+sb.toString());
	}

}
