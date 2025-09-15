package inter;

import java.util.Arrays;

public class MinimumNoOfWorkers {

	public static void main(String[] args) {
		
		int start[]= {1230,1200,1600};
		int end[]= {130,100,1700};
		int n=start.length;
		int m=end.length;
		int startMin[]=new int[n];
		int endMin[]=new int [m];
		for(int i=0;i<n;i++)
		{
			startMin[i]=toMinutes(start[i]);
			endMin[i]=toMinutes(end[i]);
			if(startMin[i]>endMin[i])
			{
				endMin[i]=24*60;
			}
			
		}
		Arrays.sort(startMin);
		Arrays.sort(endMin);
		
		int i=1;
		int j=0;
		int max=1,min=1;
		while(i<startMin.length&&j<endMin.length)
		{
			if(startMin[i]<endMin[j])
			{
				i++;
				min++;
			}
			else
			{
				min--;
				j++;
			}
			max=Math.max(max, min);
		}
		System.out.println("Minumum Workers:"+max);
	}
	public static int toMinutes(int time)
	{
		int hour=time/100;
		int min=time%100;
		return hour*60+min;
	}
}
