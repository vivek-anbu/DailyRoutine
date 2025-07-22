package inter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Problem30 {

	public static void main(String[] args) {
		
		int nums[]= {10,36,54,89,12};
		List<String> result=new ArrayList<>();
		for(int num:nums)
		{
			int weight=0;
			if(isPerfectSquare(num))
			{
				weight+=5;
			}
			else if(num%12==0)
			{
				weight+=4;
			}
			else if(num%2==0)
			{
				weight+=3;
			}
			result.add(num+","+weight);
		}
		
		Collections.sort(result,Comparator.comparingInt(s->Integer.parseInt(s.split(",")[1])));
		for(String s:result)
		{
			String str[]=s.split(",");
			System.out.println("<"+str[0]+","+str[1]+">");
		}
	}
	public static boolean isPerfectSquare(int num)
	{
		int n=(int)Math.sqrt(num);
		return n*n==num;
	}
}
