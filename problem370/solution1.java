package inter;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GenerateUniqueNumber {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Number:");
		long n=in.nextLong();
		long unique=generate(n);
		System.out.println("Unique:"+unique);
	}
	public static long generate(long n)
	{
		String str=String.valueOf(n);
		Set<Character> seen =new HashSet<>();
		StringBuilder sb=new StringBuilder();
		for(char c:str.toCharArray())
		{
			if(!seen.contains(c))
			{
				sb.append(c);
				seen.add(c);
			}
		}
		return Long.parseLong(sb.toString());
	}
	

}
