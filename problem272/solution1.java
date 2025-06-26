package inter;

import java.util.LinkedList;
import java.util.Queue;

public class Problem15 {

	public static void main(String args[])
	{
		//int n=10;
		int n=20;
		System.out.println("Nth number is :"+findNthNumber(n));
		
	}
	public static String findNthNumber(int n)
	{
		Queue<String> q=new LinkedList<>();
		q.add("3");
		q.add("4");
		int count=0;
		while(!q.isEmpty())
		{
			String current=q.poll();
			count++;
			if(count==n)
			{
				return current;
			}
			q.add(current+"3");
			q.add(current+"4");
		}
		return "";
	}
	
}
