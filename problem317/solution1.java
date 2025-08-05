package inter;

import java.util.Arrays;

public class Problem55 {

	public static void main(String[] args) {
		
		int start[]= {1200,1230,1600};
		int end[]= {130,100,1700};
		
		int n=start.length;
		int startMinutes[]=new int[n];
		int endMinutes[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			startMinutes[i]=toMinutes(start[i]);
			endMinutes[i]=toMinutes(end[i]);
			
			if(endMinutes[i]<startMinutes[i])
			{
				endMinutes[i]=24*60;
			}
		}
		
		Arrays.sort(startMinutes);
		Arrays.sort(endMinutes);
		
		int i=1;
		int j=0;
		int min=0;
		int max=0;
		while(i<startMinutes.length&&j<endMinutes.length)
		{
			if(startMinutes[i]<=endMinutes[j])
			{
				min++;
				i++;
			}
			else
			{
				min--;
				j++;
			}
			max=Math.max(max, min);
		}
		
		System.out.println("Minimum Workers Needed :" +max);
	}
	public static int toMinutes(int time)
	{
		int hour=time/100;
		int minutes=time%100;
		return hour*60+minutes;
	}
}
