package inter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem73 {

	public static void main(String[] args) {
		
		int n=120;
		List<Integer> list=decompose(n);
		Collections.reverse(list);
		
		System.out.println("Binary Decimal: ");
		for(int a:list)
		{
			System.out.print(a+" ");
		}
		

	}
	public static List<Integer> decompose(int n)
	{
		String s=String.valueOf(n);
		int maxDigit=0;
		List<Integer> ans=new ArrayList<>();
		for(char c:s.toCharArray())
		{
			maxDigit=Math.max(maxDigit, c-'0');
		}
		for(int i=0;i<maxDigit;i++)
		{
			StringBuilder sb=new StringBuilder();
			for(char c:s.toCharArray())
			{
				if(c-'0'>i)
				{
					sb.append("1");
				}
				else
				{
					sb.append("0");
				}
			}
			ans.add(Integer.parseInt(sb.toString()));
		}
		return ans;
	}

}
