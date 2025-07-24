package inter;

import java.util.LinkedList;
import java.util.Queue;

public class Problem36 {

	public static void main(String[] args) {
		
		int n=20;
		System.out.println("Nth Number is "+findNthNumber(n));
	}
	public static String findNthNumber(int n)
	{
		Queue<String> q=new LinkedList<>();
		int count=0;
		q.add("3");
		q.add("4");
		while(!q.isEmpty())
		{
			String current=q.poll();
			count++;
			if(count==n)
			{
				System.out.println(q);
				return current;
			}
			q.add(current+"3");
			q.add(current+"4");
		}
		return " ";
	}

}
