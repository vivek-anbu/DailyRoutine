package inter;

import java.util.ArrayList;
import java.util.*;

public class Problem8 {

		public static void main(String args[])
		{
			int number[]= {10, 36, 54,89,12};
			List<String> result=new ArrayList<>();
			for(int num:number)
			{
				int weight=0;
				if(isPerfectSqr(num))
				{
					weight+=5;
				}
				if(num%12==0)
				{
					weight+=4;
				}
				if(num%2==0)
				{
					weight+=3;
				}
				result.add(num+","+weight);
			}
			Collections.sort(result,Comparator.comparingInt(s->Integer.parseInt(s.split(",")[1])));
			for(String s:result)
			{
				String str[]=s.split(",");
				System.out.println("<"+str[0]+","+str[1]);
			}
		}
		public static boolean  isPerfectSqr(int num)
		{
			int sqrt=(int)Math.sqrt(num);
			return sqrt*sqrt==num;
		}
}
