package inter;

import java.util.LinkedList;
import java.util.Queue;

public class FormNumberSystem {

	public static void main(String[] args) {
		
		int n=20;
		Queue<String>ans=findNthForm(n);
		System.out.println("Nth Number is :"+ans);
	}
	
	public static Queue<String> findNthForm(int n)
	{
		Queue<String> q=new LinkedList<>();
		q.add("3");
		q.add("4");
		int count=0;
		while(!q.isEmpty())
		{
			count++;
			String current=q.poll();
			if(count==n)
			{
				return q;
			}
			q.add(current+"3");
			q.add(current+"4");
		}
		
		return new LinkedList<>();
	}

}
